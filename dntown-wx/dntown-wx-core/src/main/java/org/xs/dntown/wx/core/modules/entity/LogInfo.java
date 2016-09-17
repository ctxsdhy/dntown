package org.xs.dntown.wx.core.modules.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * 日志信息
 */
@Entity
@Table(name="dntown_wx_log")
public class LogInfo extends IdEntity {
	
	/**
	 * 类型
	 */
	private String type;
	
	/**
	 * openId
	 */
	private String openId;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	/**
	 * 创建时间
	 */
	@Column(updatable=false)
	private Date createTime;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 回复
	 */
	private String reply;
	
	/**
	 * 模块
	 */
	private String module;
	
	/**
	 * 步骤
	 */
	private String step;

	/**  
	 * 获取type  
	 * @return type type  
	 */
	public String getType() {
		return type;
	}

	/**  
	 * 设置type  
	 * @param type type  
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**  
	 * 获取openId  
	 * @return openId openId  
	 */
	public String getOpenId() {
		return openId;
	}

	/**  
	 * 设置openId  
	 * @param openId openId  
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**  
	 * 获取createTime  
	 * @return createTime createTime  
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**  
	 * 设置createTime  
	 * @param createTime createTime  
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**  
	 * 获取content  
	 * @return content content  
	 */
	public String getContent() {
		return content;
	}

	/**  
	 * 设置content  
	 * @param content content  
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**  
	 * 获取module  
	 * @return module module  
	 */
	public String getModule() {
		return module;
	}

	/**  
	 * 设置module  
	 * @param module module  
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**  
	 * 获取step  
	 * @return step step  
	 */
	public String getStep() {
		return step;
	}

	/**  
	 * 设置step  
	 * @param step step  
	 */
	public void setStep(String step) {
		this.step = step;
	}

	/**  
	 * 获取userName  
	 * @return userName userName  
	 */
	public String getUserName() {
		return userName;
	}

	/**  
	 * 设置userName  
	 * @param userName userName  
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**  
	 * 获取reply  
	 * @return reply reply  
	 */
	public String getReply() {
		return reply;
	}

	/**  
	 * 设置reply  
	 * @param reply reply  
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
}
