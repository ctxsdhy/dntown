package org.xs.dntown.wx.idiom.modules.web;

import java.util.Date;
import java.util.List;
import java.util.Random;

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
import org.xs.dntown.wx.idiom.modules.entity.IdiomListInfo;
import org.xs.dntown.wx.idiom.modules.entity.IdiomUserInfo;
import org.xs.dntown.wx.idiom.modules.entity.enums.StepEnum;
import org.xs.dntown.wx.idiom.modules.service.IdiomListService;
import org.xs.dntown.wx.idiom.modules.service.IdiomUserService;

/**
 * 核心Controller
 */
@Controller(value = "idiomCoreController")
@RequestMapping("idiom")
public class CoreController extends BaseController {
	
	@Autowired
	private IdiomUserService idiomUserService;
	
	@Autowired
	private IdiomListService idiomListService;
	
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
			userService.setModule(msgReq.getFromUserName(), ModuleEnum.idiom.getValue());
			
			//得到接龙用户信息实体
			IdiomUserInfo iUserInfo = idiomUserService.getByOpenId(userInfo.getOpenId());
			if(iUserInfo == null) {
				log.info("新增接龙用户");
				
				//如果没有就新增
				iUserInfo = new IdiomUserInfo();
				iUserInfo.setOpenId(userInfo.getOpenId());
				iUserInfo.setModuleStep(StepEnum.normal.getValue());
				iUserInfo.setStepTime(new Date());
				iUserInfo.setIsAnswered(false);
				idiomUserService.add(iUserInfo);
			}
			
			//刷新模块（1小时）
			long timeDiff = new Date().getTime() - userInfo.getModuleTime().getTime();
			long hoursDiff = timeDiff / (1000 * 60 * 60);
			if(hoursDiff >= 1) {
				idiomUserService.setStep(userInfo.getOpenId(), StepEnum.normal.getValue());
				iUserInfo.setModuleStep(StepEnum.normal.getValue());
			}
			
			log.info("开始转入步骤");
			//出题
			if(msgReq.getContent().equals("开始")) {
				
				//完成上一个成语
				if(!StringUtils.isEmpty(iUserInfo.getIdiomId()) && iUserInfo.getModuleStep().equals(StepEnum.answer.getValue())) {
					//处理答题结果
					disposeAnswer(iUserInfo, msgReq);
					
					result += finishAnswer(iUserInfo, msgReq, false) + "\n";
				}
				
				log.info("开始下一题");
				
				//下一题
				result = nextIdiom(iUserInfo, result);
				
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.idiom.getValue(), StepEnum.answer.getValue());
				result += MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			}
			//答案
			else if(msgReq.getContent().equals("答案") && iUserInfo.getModuleStep().equals(StepEnum.answer.getValue())) {
				
				//返回答案
				if(!StringUtils.isEmpty(iUserInfo.getIdiomId())) {
					
					log.info("返回答案");
					
					//完成答题
					result += finishAnswer(iUserInfo, msgReq, true);
					
					//设置步骤
					iUserInfo.setModuleStep(StepEnum.normal.getValue());
					iUserInfo.setStepTime(new Date());
					idiomUserService.update(iUserInfo);
					
					logService.addInfoLog(openId, userName, content, result, ModuleEnum.game24.getValue(), StepEnum.answer.getValue());
					result = MessageUtil.msgReqToXml(msgReq, result);
					log.info(result);
					return result;
				}
			}
			//排行榜
			else if(msgReq.getContent().equals("排行") || msgReq.getContent().equals("排行榜")) {
				
				log.info("返回排行榜");
				
				result += "【排行榜】\n";
				
				boolean flag = false;
				List<IdiomUserInfo> list = idiomUserService.getTopScope(1000);
				if(list != null && list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						if(list.get(i).getOpenId().equals(iUserInfo.getOpenId())) {
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
					result += "No." + (Integer.parseInt(idiomUserService.getRankScope(iUserInfo.getScore()))) + " 『" + userInfo.getUserName() + "』(" + iUserInfo.getScore() + "分)";
				} else {
					result = result.substring(0, result.length() - 1);
				}
				
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.idiom.getValue(), StepEnum.normal.getValue());
				result = MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			}
			
			//如果是答题状态
			if(iUserInfo.getModuleStep().equals(StepEnum.answer.getValue()) && !msgReq.getContent().equals("开始")) {
				
				//返回处理答题结果
				result = disposeAnswer(iUserInfo, msgReq);
				logService.addInfoLog(openId, userName, content, result, ModuleEnum.idiom.getValue(), StepEnum.answer.getValue());
				result = MessageUtil.msgReqToXml(msgReq, result);
				log.info(result);
				return result;
			}
			
			//返回接龙公告
			result += "『成语接龙』\n";
			result += "【规则】\n";
			result += "有3种接龙方式：\n";
			result += "与尾字相同接龙，积分+3\n";
			result += "与尾字谐音接龙，积分+1\n";
			result += "包含尾字接龙，积分+1\n";
			result += "连胜有积分奖励\n";
			result += "【说明】\n";
			result += "1、输入“开始”：开始答题\n";
			result += "2、输入“答案”：查看答案\n";
			result += "3、输入“排行”：查看排行\n";
			result += "4、输入“公告”：返回首页";
			logService.addInfoLog(openId, userName, content, result, ModuleEnum.idiom.getValue(), StepEnum.normal.getValue());
			result = MessageUtil.msgReqToXml(msgReq, result);
		} catch (Exception e) {
			log.debug("执行失败");
			logService.addErrorLog(openId, userName, content, "", ModuleEnum.idiom.getValue(), StepEnum.normal.getValue(), e);
			e.printStackTrace();
		}
		
		//返回消息
		log.info(result);
		return result;
	}
	
	/**
	 * 获得下一题
	 */
	private String nextIdiom(IdiomUserInfo iUserInfo, String result) {
		//下一题
		Random r = new Random();
		String questionId = String.valueOf(r.nextInt(29543) + 1);
		iUserInfo.setIdiomId(questionId);
		iUserInfo.setModuleStep(StepEnum.answer.getValue());
		iUserInfo.setStepTime(new Date());
		iUserInfo.setIsAnswered(false);
		//更新模块
		idiomUserService.update(iUserInfo);
		//返回题目
		IdiomListInfo idiomListInfo = idiomListService.getById(questionId);
		if(!StringUtils.isEmpty(result)) {
			result += "\n";
		}
		result += idiomListInfo.getWord();
		return result;
	}
	
	/**
	 * 处理答题结果
	 */
	private String disposeAnswer(IdiomUserInfo iUserInfo, BaseMsgReq msgReq) {
		
		log.info("处理答题结果");
		
		String result = "";
		boolean flag = true;
		int score = 0;
		
		//上一个成语
		IdiomListInfo idiomListInfo = idiomListService.getById(iUserInfo.getIdiomId());
		
		//获得回答的成语
		IdiomListInfo idiomAnswerInfo = idiomListService.getByWord(msgReq.getContent());
		
		//没有这个成语
		if(idiomAnswerInfo == null) {
			result = "这不是成语吧";
			flag = false;
		} else {
			
			//判断是否匹配
			//如果是相同匹配
			if(idiomListInfo.getWordEnd().equals(idiomAnswerInfo.getWordBegin())) {
				result = "答对了，积分+3\n";
				flag = true;
				score = 3;
			}
			//如果是谐音匹配
			else if(idiomListInfo.getWordEndSpell().equals(idiomAnswerInfo.getWordBeginSpell())) {
				result = "答对了，谐音，积分+1\n";
				flag = true;
				score = 1;
			}
			//如果是包含匹配
			else if(idiomAnswerInfo.getWord().indexOf(idiomListInfo.getWordEnd()) > -1) {
				if(idiomListInfo.getId().equals(idiomAnswerInfo.getId())) {
					//不能是同一个成语
					result = "不能是同一个成语";
					flag = false;
				} else {
					result = "答对了，包含，积分+1\n";
					flag = true;
					score = 1;
				}
			}
			//不匹配
			else {
				result = "成语没接上";
				flag = false;
			}
		}
		
		//回答正确
		if(flag) {
			
			log.info("回答正确");
			
    		//下一题
    		idiomListInfo = idiomListService.getNextIdiom(idiomAnswerInfo.getWordEnd());
    		if(idiomListInfo != null) {
    			iUserInfo.setIdiomId(idiomListInfo.getId());
    			iUserInfo.setStepTime(new Date());
    			iUserInfo.setIsAnswered(false);
    			
    			//返回题目
    			if(!StringUtils.isEmpty(result)) {
    				result += "\n";
    			}
    			result += idiomListInfo.getWord();
    		} else {
    			result += "我接不下去了，积分+5\n";
    			score += 5;
    			result = nextIdiom(iUserInfo, result);
    		}
    		
    		//更新用户积分、次数、答对次数、连胜次数、最长连胜
			iUserInfo.setScore(iUserInfo.getScore() + score);
			iUserInfo.setRightTimes(iUserInfo.getRightTimes() + 1);
			iUserInfo.setTimes(iUserInfo.getTimes() + 1);
			iUserInfo.setComboTimes(iUserInfo.getComboTimes() + 1);
    		if(iUserInfo.getComboTimes() > iUserInfo.getBestTimes()) {
    			iUserInfo.setBestTimes(iUserInfo.getComboTimes());
    		}
    		iUserInfo.setStepTime(new Date());
    		iUserInfo.setIsAnswered(false);
		}
		//回答错误
		else {
			
			log.info("回答错误");
			
			//如果第一次回答
        	if(!iUserInfo.getIsAnswered()) {
        	
	        	//更新用户积分、次数、答对次数、连胜次数、最长连胜
        		iUserInfo.setTimes(iUserInfo.getTimes() + 1);
        		iUserInfo.setIsAnswered(true);
        	}
		}
		
		//更新接龙用户
		idiomUserService.update(iUserInfo);
		
		return result;
	}
	
	/**
	 * 完成答题
	 */
	private String finishAnswer(IdiomUserInfo iUserInfo, BaseMsgReq msgReq, boolean flag) {
		
		log.info("完成答题");
		
		String result = "";
		
		//上一个成语
		IdiomListInfo idiomListInfo = idiomListService.getById(iUserInfo.getIdiomId());
		
		//下一题
		if(flag) {
			idiomListInfo = idiomListService.getNextIdiom(idiomListInfo.getWordEnd());
			if(idiomListInfo != null) {
				result += "答案：" + idiomListInfo.getWord() + "\n\n";
			} else {
				result += "答案我也不知道\n\n";
			}
		}
		
		int score = 0;
		
		int comboTimes = iUserInfo.getComboTimes();
		if(comboTimes > 1) {
			int rank = comboTimes / 5 + 1;
			score += Math.pow(2, rank);
		}
		
		//更新用户积分、次数、答对次数、连胜次数、最长连胜
		iUserInfo.setScore(iUserInfo.getScore() + score);
		iUserInfo.setStepTime(new Date());
		iUserInfo.setIsAnswered(false);
		iUserInfo.setComboTimes(0);
		
		//更新接龙用户
		idiomUserService.update(iUserInfo);
		
		result += "答对" + comboTimes + "题，连胜奖励积分+" + score;
		return result;
	}
}