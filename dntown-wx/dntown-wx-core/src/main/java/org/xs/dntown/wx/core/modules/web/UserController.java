package org.xs.dntown.wx.core.modules.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.common.utils.MessageUtil;
import org.xs.dntown.wx.common.web.BaseController;
import org.xs.dntown.wx.core.modules.entity.UserInfo;
import org.xs.dntown.wx.core.modules.entity.enums.CoreStepEnum;
import org.xs.dntown.wx.core.modules.entity.enums.ModuleEnum;
import org.xs.dntown.wx.core.modules.entity.req.BaseMsgReq;
import org.xs.dntown.wx.core.modules.service.LogService;
import org.xs.dntown.wx.core.modules.service.UserService;

/**
 * 用户Controller
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;
	
	/**
	 * 新增用户跳转设置用户名
	 */
	@ResponseBody
	@RequestMapping("toSetName")
	public String toSetName(HttpServletRequest request) {
		String result = "";
		String openId = "";
		String userName = "";
		String content = "";
		try {
			
			//得到接收消息实体
			BaseMsgReq msgReq = (BaseMsgReq)request.getAttribute("msgReq");
			openId = msgReq.getFromUserName();
			content = msgReq.getContent();
			
			//新增用户
			UserInfo userInfo = new UserInfo();
			userInfo.setOpenId(msgReq.getFromUserName());
			userInfo.setModuleTime(new Date());
			userInfo.setCreateTime(new Date());
			userInfo.setStep(CoreStepEnum.name.getValue());
			userInfo.setModule(ModuleEnum.normal.getValue());
			userService.add(userInfo);
			userName = userInfo.getUserName();
			
			result = "欢迎来到晨夜小镇~\n请输入你的昵称：";
			logService.addInfoLog(openId, userName, content, result, ModuleEnum.normal.getValue(), CoreStepEnum.name.getValue());
			result = MessageUtil.msgReqToXml(msgReq, result);
		} catch (Exception e) {
			log.debug("执行失败");
			logService.addErrorLog(openId, userName, content, "", ModuleEnum.normal.getValue(), CoreStepEnum.name.getValue(), e);
			e.printStackTrace();
		}
		log.info(result);
		return result;
	}
	
	/**
	 * 跳转到公告
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("toNotice")
	public String toNotice(HttpServletRequest request) {
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
			
			result += "『" + userInfo.getUserName() + "』同学你好\n";
			result += "【说明】\n";
			result += "1、输入“公告”：查看公告\n";
			result += "2、输入“24点”：24点游戏\n";
			result += "3、输入“接龙”：成语接龙";
			
			logService.addInfoLog(openId, userName, content, result, ModuleEnum.normal.getValue(), CoreStepEnum.normal.getValue());
			result = MessageUtil.msgReqToXml(msgReq, result);
		} catch (Exception e) {
			log.debug("执行失败");
			logService.addErrorLog(openId, userName, content, "", ModuleEnum.normal.getValue(), CoreStepEnum.normal.getValue(), e);
			e.printStackTrace();
		}
		log.info(result);
		return result;
	}
}
