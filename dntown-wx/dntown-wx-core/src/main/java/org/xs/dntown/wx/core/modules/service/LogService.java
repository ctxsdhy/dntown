package org.xs.dntown.wx.core.modules.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.xs.dntown.wx.common.service.BaseService;
import org.xs.dntown.wx.core.modules.entity.LogInfo;
import org.xs.dntown.wx.core.modules.entity.enums.LogEnum;

/**
 * 日志服务层
 */
@Service
public class LogService extends BaseService<LogInfo> {
	
	/**
	 * 增加信息日志
	 */
	public void addInfoLog(String openId, String userName, String content, String reply, String module, String step) {
		LogInfo logInfo = new LogInfo();
		logInfo.setType(LogEnum.info.getValue());
		logInfo.setOpenId(openId);
		logInfo.setUserName(userName);
		logInfo.setContent(content);
		logInfo.setReply(reply);
		logInfo.setModule(module);
		logInfo.setStep(step);
		logInfo.setCreateTime(new Date());
		queryDao.clear();
		queryDao.add(logInfo);
	}
	
	/**
	 * 增加报错日志
	 */
	public void addErrorLog(String openId, String userName, String content, String reply, String module, String step, Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw, true);
		e.printStackTrace(pw);
		pw.flush();
		sw.flush();
        
		LogInfo logInfo = new LogInfo();
		logInfo.setType(LogEnum.error.getValue());
		logInfo.setOpenId(openId);
		logInfo.setUserName(userName);
		logInfo.setContent(content);
		logInfo.setReply(sw.toString() + "\n" + reply);
		logInfo.setModule(module);
		logInfo.setStep(step);
		logInfo.setCreateTime(new Date());
		queryDao.clear();
		queryDao.add(logInfo);
	}
}
