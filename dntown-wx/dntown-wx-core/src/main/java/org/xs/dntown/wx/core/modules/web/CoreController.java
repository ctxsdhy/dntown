package org.xs.dntown.wx.core.modules.web;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xs.dntown.wx.core.common.config.Global;
import org.xs.dntown.wx.core.common.utils.Encodes;
import org.xs.dntown.wx.core.modules.entity.req.VerifyAccessReq;

/**
 * 核心Controller
 */
@Controller
public class CoreController {

	/**
	 * 接入验证
	 */
	@ResponseBody
	@RequestMapping(value = "/verifyAccess", produces = { "text/plain;charset=utf-8" })
	public String verifyAccess(VerifyAccessReq req) throws Exception {
		
		String token = Global.getConfig("wx.token");
		String[] ArrTmp = {token, req.getTimestamp(), req.getNonce()};
		Arrays.sort(ArrTmp);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ArrTmp.length; i++) {
			sb.append(ArrTmp[i]);
		}
		String pwd = Encodes.Encrypt(sb.toString());  
		
		//log
          
		if(!StringUtils.isEmpty(pwd) && pwd.equals(req.getSignature())) {
			return req.getEchostr();
		} else {
			return "";
		}
	}
}