package org.xs.dntown.wx.game24.modules.web;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.common.utils.MessageUtil;
import org.xs.dntown.wx.common.web.BaseController;
import org.xs.dntown.wx.core.modules.entity.UserInfo;
import org.xs.dntown.wx.core.modules.entity.enums.ModuleEnum;
import org.xs.dntown.wx.core.modules.entity.req.BaseMsgReq;
import org.xs.dntown.wx.core.modules.service.LogService;
import org.xs.dntown.wx.core.modules.service.UserService;
import org.xs.dntown.wx.game24.modules.entity.Game24UserInfo;
import org.xs.dntown.wx.game24.modules.entity.QuestionInfo;
import org.xs.dntown.wx.game24.modules.entity.enums.StepEnum;
import org.xs.dntown.wx.game24.modules.service.Game24UserService;
import org.xs.dntown.wx.game24.modules.service.QuestionService;

/**
 * 核心Controller
 */
@Controller(value = "game24CoreController")
@RequestMapping("game24")
public class CoreController extends BaseController {
	
	@Autowired
	private Game24UserService game24UserService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;
	
	/**
	 * 文本消息
	 */
	@ResponseBody
	@RequestMapping(value = "msg", produces = { "text/plain;charset=utf-8" })
	public String textMsg(HttpServletRequest request) throws Exception {
		String result = "";
		String openId = "";
		String userName = "";
		String content = "";
		try {
			
			//得到接收消息实体
			BaseMsgReq msgReq = (BaseMsgReq)request.getAttribute("msgReq");
			openId = msgReq.getFromUserName();
			content = msgReq.getContent();
			
			//得到用户信息实体
			UserInfo userInfo = (UserInfo)request.getAttribute("userInfo");
			userName = userInfo.getUserName();
			
			log.info("收到消息：" + msgReq.getContent());
			
			//更新模块
			userService.setModule(msgReq.getFromUserName(), ModuleEnum.game24.getValue());
			
			//得到game24用户信息实体
			Game24UserInfo gUserInfo = game24UserService.getByOpenId(userInfo.getOpenId());
			if(gUserInfo == null) {
				log.info("新增game24用户");
				
				//如果没有就新增
				gUserInfo = new Game24UserInfo();
				gUserInfo.setOpenId(userInfo.getOpenId());
				gUserInfo.setModuleStep(StepEnum.normal.getValue());
				gUserInfo.setStepTime(new Date());
				gUserInfo.setIsAnswered(false);
				game24UserService.add(gUserInfo);
			}
			
			//刷新模块（1小时）
			long timeDiff = new Date().getTime() - userInfo.getModuleTime().getTime();
			long hoursDiff = timeDiff / (1000 * 60 * 60);
			if(hoursDiff >= 1) {
				game24UserService.setStep(userInfo.getOpenId(), StepEnum.normal.getValue());
				gUserInfo.setModuleStep(StepEnum.normal.getValue());
			}
			
			log.info("开始转入步骤");				
			//出题
			if(msgReq.getContent().equals("24")) {
				
				//计算上一道题
				if(!StringUtils.isEmpty(gUserInfo.getQuestionId()) && gUserInfo.getModuleStep().equals(StepEnum.answer.getValue())) {
					//处理答题结果
					finishAnswer(gUserInfo, msgReq);
				}
				
				log.info("开始下一题");
				//下一题
				Random r = new Random();
				String questionId = String.valueOf(r.nextInt(403) + 1);
				gUserInfo.setQuestionId(questionId);
				gUserInfo.setModuleStep(StepEnum.answer.getValue());
				gUserInfo.setStepTime(new Date());
				gUserInfo.setIsAnswered(false);
				//更新模块
				game24UserService.update(gUserInfo);
				//返回题目
				QuestionInfo questionInfo = questionService.getById(questionId);
				result = "请听题：" + questionInfo.getNum1() + "、" + questionInfo.getNum2() + "、" + questionInfo.getNum3() + "、" + questionInfo.getNum4();
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.game24.getValue(), StepEnum.answer.getValue());
				result = MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			} 
			//答案
			else if(msgReq.getContent().equals("答案")) {
				
				//返回答案
				if(!StringUtils.isEmpty(gUserInfo.getQuestionId())) {
					
					log.info("返回答案");
					
					//完成答题
					finishAnswer(gUserInfo, msgReq);
					
					//设置步骤
					gUserInfo.setModuleStep(StepEnum.normal.getValue());
					gUserInfo.setStepTime(new Date());
					game24UserService.update(gUserInfo);
					
					//答案
					String answer = questionService.getAnswer(gUserInfo.getQuestionId());
					logService.addInfoLog(openId, userName, content, answer, ModuleEnum.game24.getValue(), StepEnum.answer.getValue());
					result = MessageUtil.msgReqToXml(msgReq, answer);
					log.info(result);
					return result;
				}
			}
			//排行榜
			else if(msgReq.getContent().equals("排行") || msgReq.getContent().equals("排行榜")) {
				
				log.info("返回排行榜");
				
				result += "【排行榜】\n";
				
				boolean flag = false;
				List<Game24UserInfo> list = game24UserService.getTopScope(1000);
				if(list != null && list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						if(list.get(i).getOpenId().equals(gUserInfo.getOpenId())) {
							flag = true;
						}
						//TODO 优化
						UserInfo sUserInfo = userService.getByOpenId(list.get(i).getOpenId());
						if(sUserInfo != null) {
							result += "No." + (i + 1) + " 『" + sUserInfo.getUserName() + "』(" + list.get(i).getScore() + "分)\n";
						}
					}
				}
				
				if(!flag) {
					result += "No." + (Integer.parseInt(game24UserService.getRankScope(gUserInfo.getScore())) + 1) + " 『" + userInfo.getUserName() + "』(" + gUserInfo.getScore() + "分)";
				} else {
					result = result.substring(0, result.length() - 1);
				}
				
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.game24.getValue(), StepEnum.normal.getValue());
				result = MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			}
			
			//如果是答题状态
			if(gUserInfo.getModuleStep().equals(StepEnum.answer.getValue()) && !msgReq.getContent().equals("24点")) {
				
				//返回处理答题结果
				result = finishAnswer(gUserInfo, msgReq);
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.game24.getValue(), StepEnum.answer.getValue());
				result = MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			}
			
			//返回game24公告
			result += "『24点游戏』\n";
			result += "【规则】\n";
			result += "利用 + - * / ( ) 列出综合算式\n结果是24即可\n";
			result += "【说明】\n";
			result += "1、输入“24”：开始答题\n";
			result += "2、输入“答案”：查看答案\n";
			result += "3、输入“排行”：查看排行\n";
			result += "4、输入“公告”：返回首页";
			logService.addInfoLog(openId, userName, content, result, ModuleEnum.game24.getValue(), StepEnum.normal.getValue());
			result = MessageUtil.msgReqToXml(msgReq, result);
		} catch (Exception e) {
			log.debug("执行失败");
			logService.addErrorLog(openId, userName, content, "", ModuleEnum.game24.getValue(), StepEnum.normal.getValue(), e);
			e.printStackTrace();
		}
		
		//返回消息
		log.info(result);
		return result;
	}
	
	/**
	 * 处理答题结果
	 */
	private String finishAnswer(Game24UserInfo gUserInfo, BaseMsgReq msgReq) {
		
		log.info("处理答题结果");
		
		String result = "";
		
		//题目
		QuestionInfo questionInfo = questionService.getById(gUserInfo.getQuestionId());
		
		//计算
		String answer = msgReq.getContent();
		answer = answer.replace("（", "(").replace("）", ")").replace("÷", "/").replace("／", "/").replace("×", "*").replace("－", "-").replace("—", "-");
		//计算表达式结果
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        Double res = (double) 0;
        try {
        	
        	//校对答案
        	boolean flag = true;
        	String nums = answer.replace("(", "").replace(")", "").replace("*", "").replace("/", "").replace("-", "").replace("+", "");
        	if(nums.length() != 4) {
        		flag = false;
        	} else {
	        	char[] strs = nums.toCharArray();
	        	Arrays.sort(strs);
	        	if(!String.valueOf(strs).equals(String.valueOf(questionInfo.getNum1()) + String.valueOf(questionInfo.getNum2()) + String.valueOf(questionInfo.getNum3()) + String.valueOf(questionInfo.getNum4())))
	        	{
	        		flag = false;
	        	}
        	}
        	
        	if(flag) {
        		res =(Double) se.eval(answer);
        	} else {
				res = 0.0;
			}
		} catch (ScriptException e) {
			log.debug("运算失败");
			//e.printStackTrace();
		}
        
        //回答正确
        if(res == 24) {
        	
        	log.info("回答正确");
        	
        	//计算用时
        	long timeDiff = new Date().getTime() - gUserInfo.getStepTime().getTime();
			long secondsDiff = timeDiff / (1000);
        	
			int score = 0;
			//30秒以内加5分
			if(secondsDiff < 30) {
				score = 5;
			} 
			//60秒以内加3分
			else if(secondsDiff < 60) {
				score = 3;
			} 
			//加1分
			else {
				score = 1;
			}
			
			result = "答对了！用时" + secondsDiff + "s，积分 +" + score ;
			
			//更新用户积分、次数、答对次数、命中率
			gUserInfo.setScore(gUserInfo.getScore() + score);
			gUserInfo.setRightTimes(gUserInfo.getRightTimes() + 1);
			gUserInfo.setTimes(gUserInfo.getTimes() + 1);
			NumberFormat numberFormat = NumberFormat.getInstance();
			numberFormat.setMaximumFractionDigits(2);
			gUserInfo.setHitRate(Float.valueOf(numberFormat.format((float) gUserInfo.getRightTimes() / (float) gUserInfo.getTimes() * 100)));
			gUserInfo.setModuleStep(StepEnum.normal.getValue());
			gUserInfo.setStepTime(new Date());
			gUserInfo.setIsAnswered(false);
			
			//更新试题次数、答对次数、命中率
			questionInfo.setRightTimes(questionInfo.getRightTimes() + 1);
			questionInfo.setTimes(questionInfo.getTimes() + 1);
			numberFormat.setMaximumFractionDigits(2);
			questionInfo.setHitRate(Float.valueOf(numberFormat.format((float) questionInfo.getRightTimes() / (float) questionInfo.getTimes() * 100)));
        } 
        //回答错误
        else {
        	
        	log.info("回答错误");
        	
        	//如果第一次回答
        	if(!gUserInfo.getIsAnswered()) {
        	
	        	//更新用户积分、次数、答对次数、命中率
				gUserInfo.setTimes(gUserInfo.getTimes() + 1);
				NumberFormat numberFormat = NumberFormat.getInstance();
				numberFormat.setMaximumFractionDigits(2);
				gUserInfo.setHitRate(Float.valueOf(numberFormat.format((float) gUserInfo.getRightTimes() / (float) gUserInfo.getTimes() * 100)));
				gUserInfo.setIsAnswered(true);
				
				//更新试题次数、答对次数、命中率
				questionInfo.setTimes(questionInfo.getTimes() + 1);
				numberFormat.setMaximumFractionDigits(2);
				questionInfo.setHitRate(Float.valueOf(numberFormat.format((float) questionInfo.getRightTimes() / (float) questionInfo.getTimes() * 100)));
        	}
        	
        	gUserInfo.setModuleStep(StepEnum.answer.getValue());
			gUserInfo.setStepTime(new Date());
        	
			result = "错误";
        }
        
        //更新game24用户
        game24UserService.update(gUserInfo);
        
        //更新题目
        questionService.update(questionInfo);
        
		return result;
	}
}