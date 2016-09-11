package org.xs.dntown.wx.game24.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * 题目信息
 */
@Entity
@Table(name="dntown_wx_game24_question")
public class QuestionInfo extends IdEntity {
	
	/**
	 * num1
	 */
	private int num1;
	
	/**
	 * num2
	 */
	private int num2;
	
	/**
	 * num3
	 */
	private int num3;
	
	/**
	 * num4
	 */
	private int num4;
	
	/**
	 * 答案
	 */
	private String answer;
	
	/**
	 * 答题次数
	 */
	private int times;
	
	/**
	 * 命中次数
	 */
	private int rightTimes;
	
	/**
	 * 命中率
	 */
	private float hitRate;

	/**  
	 * 获取num1  
	 * @return num1 num1  
	 */
	public int getNum1() {
		return num1;
	}

	/**  
	 * 设置num1  
	 * @param num1 num1  
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**  
	 * 获取num2  
	 * @return num2 num2  
	 */
	public int getNum2() {
		return num2;
	}

	/**  
	 * 设置num2  
	 * @param num2 num2  
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	/**  
	 * 获取num3  
	 * @return num3 num3  
	 */
	public int getNum3() {
		return num3;
	}

	/**  
	 * 设置num3  
	 * @param num3 num3  
	 */
	public void setNum3(int num3) {
		this.num3 = num3;
	}

	/**  
	 * 获取num4  
	 * @return num4 num4  
	 */
	public int getNum4() {
		return num4;
	}

	/**  
	 * 设置num4  
	 * @param num4 num4  
	 */
	public void setNum4(int num4) {
		this.num4 = num4;
	}

	/**  
	 * 获取answer  
	 * @return answer answer  
	 */
	public String getAnswer() {
		return answer;
	}

	/**  
	 * 设置answer  
	 * @param answer answer  
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
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
	 * 获取hitRate  
	 * @return hitRate hitRate  
	 */
	public float getHitRate() {
		return hitRate;
	}

	/**  
	 * 设置hitRate  
	 * @param hitRate hitRate  
	 */
	public void setHitRate(float hitRate) {
		this.hitRate = hitRate;
	}
}
