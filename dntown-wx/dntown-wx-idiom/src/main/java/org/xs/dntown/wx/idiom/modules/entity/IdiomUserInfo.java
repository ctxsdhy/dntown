package org.xs.dntown.wx.idiom.modules.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * 接龙用户信息
 */
@Entity
@Table(name="dntown_wx_idiom_user")
public class IdiomUserInfo extends IdEntity {
	
	/**
	 * openId
	 */
	private String openId;
	
	/**
	 * 当前步骤
	 */
	private String moduleStep;
	
	/**
	 * 步骤更新时间
	 */
	private Date stepTime;
	
	/**
	 * 成语id
	 */
	private String idiomId;
	
	/**
	 * 积分
	 */
	private int score;
	
	/**
	 * 答题次数
	 */
	private int times;
	
	/**
	 * 答对次数
	 */
	private int rightTimes;
	
	/**
	 * 连胜次数
	 */
	private int comboTimes;
	
	/**
	 * 最长连胜
	 */
	private int bestTimes;
	
	/**
	 * 是否已答题
	 */
	private boolean isAnswered;

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
	 * 获取moduleStep  
	 * @return moduleStep moduleStep  
	 */
	public String getModuleStep() {
		return moduleStep;
	}

	/**  
	 * 设置moduleStep  
	 * @param moduleStep moduleStep  
	 */
	public void setModuleStep(String moduleStep) {
		this.moduleStep = moduleStep;
	}

	/**  
	 * 获取stepTime  
	 * @return stepTime stepTime  
	 */
	public Date getStepTime() {
		return stepTime;
	}

	/**  
	 * 设置stepTime  
	 * @param stepTime stepTime  
	 */
	public void setStepTime(Date stepTime) {
		this.stepTime = stepTime;
	}

	/**  
	 * 获取idiomId  
	 * @return idiomId idiomId  
	 */
	public String getIdiomId() {
		return idiomId;
	}

	/**  
	 * 设置idiomId  
	 * @param idiomId idiomId  
	 */
	public void setIdiomId(String idiomId) {
		this.idiomId = idiomId;
	}

	/**  
	 * 获取score  
	 * @return score score  
	 */
	public int getScore() {
		return score;
	}

	/**  
	 * 设置score  
	 * @param score score  
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**  
	 * 获取times  
	 * @return times times  
	 */
	public int getTimes() {
		return times;
	}

	/**  
	 * 设置times  
	 * @param times times  
	 */
	public void setTimes(int times) {
		this.times = times;
	}

	/**  
	 * 获取rightTimes  
	 * @return rightTimes rightTimes  
	 */
	public int getRightTimes() {
		return rightTimes;
	}

	/**  
	 * 设置rightTimes  
	 * @param rightTimes rightTimes  
	 */
	public void setRightTimes(int rightTimes) {
		this.rightTimes = rightTimes;
	}

	/**  
	 * 获取isAnswered  
	 * @return isAnswered isAnswered  
	 */
	public boolean getIsAnswered() {
		return isAnswered;
	}

	/**  
	 * 设置isAnswered  
	 * @param isAnswered isAnswered  
	 */
	public void setIsAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}

	/**  
	 * 获取comboTimes  
	 * @return comboTimes comboTimes  
	 */
	public int getComboTimes() {
		return comboTimes;
	}

	/**  
	 * 设置comboTimes  
	 * @param comboTimes comboTimes  
	 */
	public void setComboTimes(int comboTimes) {
		this.comboTimes = comboTimes;
	}

	/**  
	 * 获取bestTimes  
	 * @return bestTimes bestTimes  
	 */
	public int getBestTimes() {
		return bestTimes;
	}

	/**  
	 * 设置bestTimes  
	 * @param bestTimes bestTimes  
	 */
	public void setBestTimes(int bestTimes) {
		this.bestTimes = bestTimes;
	}
}
