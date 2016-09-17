package org.xs.dntown.wx.core.modules.web;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.common.config.Global;
import org.xs.dntown.wx.common.utils.Encodes;
import org.xs.dntown.wx.common.utils.MessageUtil;
import org.xs.dntown.wx.common.web.BaseController;
import org.xs.dntown.wx.core.modules.entity.UserInfo;
import org.xs.dntown.wx.core.modules.entity.enums.CoreStepEnum;
import org.xs.dntown.wx.core.modules.entity.enums.ModuleEnum;
import org.xs.dntown.wx.core.modules.entity.req.BaseMsgReq;
import org.xs.dntown.wx.core.modules.entity.req.VerifyAccessReq;
import org.xs.dntown.wx.core.modules.service.LogService;
import org.xs.dntown.wx.core.modules.service.UserService;

/**
 * 核心Controller
 */
@Controller
public class CoreController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;
	
	/**
	 * 接收消息
	 */
	@RequestMapping(method = {RequestMethod.POST }, produces = "application/xml;charset=UTF-8")
	public String getMsg(HttpServletRequest request) {
		String openId = "";
		String userName = "";
		String content = "";
		try {
			
			//从流中获取xml数据转入map
			Map<String, String> reqMap = MessageUtil.parseXml(request);
			
			//得到接收消息实体
			BaseMsgReq msgReq = new BaseMsgReq();
			msgReq.setToUserName(reqMap.get("ToUserName"));
			msgReq.setFromUserName(reqMap.get("FromUserName"));
			msgReq.setCreateTime(reqMap.get("CreateTime"));
			msgReq.setMsgType(reqMap.get("MsgType"));
			msgReq.setMsgId(reqMap.get("MsgId"));
			msgReq.setContent(reqMap.get("Content"));
			msgReq.setEvent(reqMap.get("Event"));
			request.setAttribute("msgReq", msgReq);
			openId = msgReq.getFromUserName();
			content = msgReq.getContent();
			
			//消息处理/跳转
			if(!StringUtils.isEmpty(msgReq.getMsgType())) {
				log.info("进行消息处理了");
				
				//如果是事件
				if(msgReq.getMsgType().equals("event")) {
					log.info("进入事件处理");
					if(msgReq.getEvent().toUpperCase().equals("SUBSCRIBE")) {
						log.info("新增用户然后跳转");
						//新增用户然后跳转
						return "forward:/user/toSetName";
					}
					if(msgReq.getEvent().toUpperCase().equals("UNSUBSCRIBE")) {
						log.info("删除此用户");
						logService.addInfoLog(openId, userName, content, "删除用户", ModuleEnum.normal.getValue(), CoreStepEnum.normal.getValue());
						//删除此用户
						userService.deleteByOpenId(msgReq.getFromUserName());
						return "";
					}
				}
				
				//第一次登陆需要输入用户名
				if(!userService.existOpenId(msgReq.getFromUserName())) {
					log.info("新增用户然后跳转");
					//新增用户然后跳转
					return "forward:/user/toSetName";
				}
				
				//获得用户信息
				UserInfo userInfo = userService.getByOpenId(msgReq.getFromUserName());
				request.setAttribute("userInfo", userInfo);
				userName = userInfo.getUserName();
				log.info("获得用户信息");
				
				//取名
				if(userInfo.getStep().equals(CoreStepEnum.name.getValue())) {
					log.info("取名成功");
					userService.setUserName(msgReq.getFromUserName(), reqMap.get("Content"));
					//设置正常步骤
					userService.setCoreStep(msgReq.getFromUserName(), CoreStepEnum.normal.getValue());
					userInfo.setUserName(reqMap.get("Content"));
				}
				
				//刷新模块（1小时）
				/*long timeDiff = new Date().getTime() - userInfo.getModuleTime().getTime();
				long hoursDiff = timeDiff / (1000 * 60 * 60);
				if(hoursDiff >= 1) {
					userService.setModule(msgReq.getFromUserName(), ModuleEnum.normal.getValue());
					userInfo.setModule(ModuleEnum.normal.getValue());
				}*/
				
				log.info("开始转入模块");
				//设置转入模块
				//core
				if(reqMap.get("Content").equals("公告")) {
					userService.setModule(msgReq.getFromUserName(), ModuleEnum.normal.getValue());
					userInfo.setModule(ModuleEnum.normal.getValue());
				}
				//game24
				else if(reqMap.get("Content").equals("24点") && !userInfo.getModule().equals(ModuleEnum.game24.getValue())) {
					userService.setModule(msgReq.getFromUserName(), ModuleEnum.game24.getValue());
					userInfo.setModule(ModuleEnum.game24.getValue());
				}
				//成语接龙
				else if(reqMap.get("Content").equals("接龙") && !userInfo.getModule().equals(ModuleEnum.idiom.getValue())) {
					userService.setModule(msgReq.getFromUserName(), ModuleEnum.idiom.getValue());
					userInfo.setModule(ModuleEnum.idiom.getValue());
				}
				
				//如果没有转入模块就返回信息
				if(userInfo.getModule().equals(ModuleEnum.normal.getValue())) {
					log.info("跳转公告");
					//跳转到公告
					return "forward:/user/toNotice";
				} 
				//跳转到game24
				else if(userInfo.getModule().equals(ModuleEnum.game24.getValue())) {
					log.info("转入game24");
					return "forward:/game24/msg";
				}
				//跳转到成语接龙
				else if(userInfo.getModule().equals(ModuleEnum.idiom.getValue())) {
					//TODO
					userService.setModule(msgReq.getFromUserName(), ModuleEnum.normal.getValue());
					userInfo.setModule(ModuleEnum.normal.getValue());
					
					log.info("转入成语接龙");
					return "forward:/idiom";
				}
			}
		} catch (Exception e) {
			log.debug("执行失败");
			logService.addErrorLog(openId, userName, content, "", ModuleEnum.normal.getValue(), CoreStepEnum.normal.getValue(), e);
			e.printStackTrace();
		}
		
		logService.addInfoLog(openId, userName, content, "返回空", ModuleEnum.normal.getValue(), CoreStepEnum.normal.getValue());
		return "forward:/empty";
	}
	
	/**
	 * 接入验证
	 */
	@ResponseBody
	@RequestMapping(method = {RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String verifyAccess(VerifyAccessReq req) {
		try {
			if(!StringUtils.isEmpty(req.getEchostr())) {
				String token = Global.getConfig("wx.token");
				String[] ArrTmp = {token, req.getTimestamp(), req.getNonce()};
				Arrays.sort(ArrTmp);
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < ArrTmp.length; i++) {
					sb.append(ArrTmp[i]);
				}
				//进行sha1加密
				String pwd = Encodes.Encrypt(sb.toString());
				//如果相同就返回
				if(!StringUtils.isEmpty(pwd) && pwd.equals(req.getSignature())) {
					log.info("认证通过");
					return req.getEchostr();
				}
			}
		} catch (Exception e) {
			log.debug("认证失败");
			e.printStackTrace();
		}
		log.info("认证失败");
		return "";
	}
	
	/**
	 * 返回空
	 */
	@ResponseBody
	@RequestMapping(value = "/empty", produces = { "text/plain;charset=utf-8" })
	public String empty() throws Exception {
		log.debug("返回空");
		return "";
	}
	
	/**
	 * 文本消息
	 */
	@ResponseBody
	@RequestMapping(value = "/idiom", produces = { "text/plain;charset=utf-8" })
	public String textMsg(HttpServletRequest request) throws Exception {
		String result = "";
		try {
			
			//得到接收消息实体
			BaseMsgReq msgReq = (BaseMsgReq)request.getAttribute("msgReq");
			
			if(!StringUtils.isEmpty(msgReq.getContent())) {
				log.info("收到消息：" + msgReq.getContent());
				result = MessageUtil.msgReqToXml(msgReq, "开发中..");
			}
		} catch (Exception e) {
			log.debug("执行失败");
			e.printStackTrace();
		}
		
		//返回消息
		return result;
	}
}