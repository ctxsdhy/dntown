package org.xs.dntown.wx.core.modules.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * 用户信息
 */
@Entity
@Table(name="dntown_wx_user")
public class UserInfo extends IdEntity {
	
	/**
	 * openId
	 */
	private String openId;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	/**
	 * 当前步骤
	 */
	private String step;
	
	/**
	 * 当前模块
	 */
	private String module;
	
	/**
	 * 模块更新时间
	 */
	private Date moduleTime;
	
	/**
	 * 创建时间
	 */
	@Column(updatable=false)
	private Date createTime;

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
	 * 获取moduleTime  
	 * @return moduleTime moduleTime  
	 */
	public Date getModuleTime() {
		return moduleTime;
	}

	/**  
	 * 设置moduleTime  
	 * @param moduleTime moduleTime  
	 */
	public void setModuleTime(Date moduleTime) {
		this.moduleTime = moduleTime;
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
}
