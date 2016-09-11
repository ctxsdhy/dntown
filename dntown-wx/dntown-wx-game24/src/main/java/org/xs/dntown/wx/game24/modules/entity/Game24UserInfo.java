package org.xs.dntown.wx.game24.modules.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * game24用户信息
 */
@Entity
@Table(name="dntown_wx_game24_user")
public class Game24UserInfo extends IdEntity {
	
	/**
	 * openId
	 */
	private String openId;
	
	/**
	 * 答题次数
	 */
	private int times;
	
	/**
	 * 正确次数
	 */
	private int rightTimes;
	
	/**
	 * 命中率
	 */
	private float hitRate;
	
	/**
	 * 积分
	 */
	private int score;
	
	/**
	 * 等级
	 */
	private String rank;
	
	/**
	 * 当前步骤
	 */
	private String moduleStep;
	
	/**
	 * 步骤更新时间
	 */
	private Date stepTime;
	
	/**
	 * 题目Id
	 */
	private String questionId;
	
	/**  
	 * 获取hitRate  
	 * @return hitRate hitRate  
	 */
	public Float getHitRate() {
		return hitRate;
	}

	/**  
	 * 设置hitRate  
	 * @param hitRate hitRate  
	 */
	public void setHitRate(Float hitRate) {
		this.hitRate = hitRate;
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
	 * 获取rank  
	 * @return rank rank  
	 */
	public String getRank() {
		return rank;
	}

	/**  
	 * 设置rank  
	 * @param rank rank  
	 */
	public void setRank(String rank) {
		this.rank = rank;
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
	 * 设置hitRate  
	 * @param hitRate hitRate  
	 */
	public void setHitRate(float hitRate) {
		this.hitRate = hitRate;
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
	 * 获取questionId  
	 * @return questionId questionId  
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**  
	 * 设置questionId  
	 * @param questionId questionId  
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
}
