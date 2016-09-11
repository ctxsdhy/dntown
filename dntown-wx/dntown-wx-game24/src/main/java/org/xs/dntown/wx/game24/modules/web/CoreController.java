package org.xs.dntown.wx.game24.modules.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.common.utils.MessageUtil;
import org.xs.dntown.wx.common.web.BaseController;
import org.xs.dntown.wx.core.modules.entity.req.BaseMsgReq;
import org.xs.dntown.wx.core.modules.entity.req.TextMsgReq;
import org.xs.dntown.wx.core.modules.entity.res.TextMsgRes;

/**
 * 核心Controller
 */
@Controller(value = "game24CoreController")
@RequestMapping("game24")
public class CoreController extends BaseController {

	/**
	 * 文本消息
	 */
	@ResponseBody
	@RequestMapping(value = "msg", produces = { "text/plain;charset=utf-8" })
	public String textMsg(HttpServletRequest request) throws Exception {
		String result = "";
		try {
			
			//得到接收消息实体
			BaseMsgReq msgReq = (BaseMsgReq)request.getAttribute("msgReq");
			
			if(!StringUtils.isEmpty(msgReq.getContent())) {
				log.info("收到消息：" + msgReq.getContent());
				
				
				
				
				
				
				
				
				result = MessageUtil.msgReqToXml(msgReq, "开发中...");
			}
		} catch (Exception e) {
			log.debug("执行失败");
			e.printStackTrace();
		}
		
		//返回消息
		return result;
	}
}