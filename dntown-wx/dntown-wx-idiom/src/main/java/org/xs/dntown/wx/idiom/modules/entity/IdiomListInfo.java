package org.xs.dntown.wx.idiom.modules.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.xs.dntown.wx.common.persistence.IdEntity;

/**
 * 接龙成语列表
 */
@Entity
@Table(name="dntown_wx_idiom_list")
public class IdiomListInfo extends IdEntity {
	
	/**
	 * 成语
	 */
	private String word;
	
	/**
	 * 首字
	 */
	private String wordBegin;
	
	/**
	 * 首字拼音
	 */
	private String wordBeginSpell;
	
	/**
	 * 尾字
	 */
	private String wordEnd;
	
	/**
	 * 尾字拼音
	 */
	private String wordEndSpell;
	
	/**
	 * 拼音
	 */
	private String spell;
	
	/**
	 * 解释
	 */
	private String content;
	
	/**
	 * 出自
	 */
	private String derivation;
	
	/**
	 * 示例
	 */
	private String sample;

	/**  
	 * 获取word  
	 * @return word word  
	 */
	public String getWord() {
		return word;
	}

	/**  
	 * 设置word  
	 * @param word word  
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**  
	 * 获取wordBegin  
	 * @return wordBegin wordBegin  
	 */
	public String getWordBegin() {
		return wordBegin;
	}

	/**  
	 * 设置wordBegin  
	 * @param wordBegin wordBegin  
	 */
	public void setWordBegin(String wordBegin) {
		this.wordBegin = wordBegin;
	}

	/**  
	 * 获取wordBeginSpell  
	 * @return wordBeginSpell wordBeginSpell  
	 */
	public String getWordBeginSpell() {
		return wordBeginSpell;
	}

	/**  
	 * 设置wordBeginSpell  
	 * @param wordBeginSpell wordBeginSpell  
	 */
	public void setWordBeginSpell(String wordBeginSpell) {
		this.wordBeginSpell = wordBeginSpell;
	}

	/**  
	 * 获取wordEnd  
	 * @return wordEnd wordEnd  
	 */
	public String getWordEnd() {
		return wordEnd;
	}

	/**  
	 * 设置wordEnd  
	 * @param wordEnd wordEnd  
	 */
	public void setWordEnd(String wordEnd) {
		this.wordEnd = wordEnd;
	}

	/**  
	 * 获取wordEndSpell  
	 * @return wordEndSpell wordEndSpell  
	 */
	public String getWordEndSpell() {
		return wordEndSpell;
	}

	/**  
	 * 设置wordEndSpell  
	 * @param wordEndSpell wordEndSpell  
	 */
	public void setWordEndSpell(String wordEndSpell) {
		this.wordEndSpell = wordEndSpell;
	}

	/**  
	 * 获取spell  
	 * @return spell spell  
	 */
	public String getSpell() {
		return spell;
	}

	/**  
	 * 设置spell  
	 * @param spell spell  
	 */
	public void setSpell(String spell) {
		this.spell = spell;
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
	 * 获取derivation  
	 * @return derivation derivation  
	 */
	public String getDerivation() {
		return derivation;
	}

	/**  
	 * 设置derivation  
	 * @param derivation derivation  
	 */
	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	/**  
	 * 获取sample  
	 * @return sample sample  
	 */
	public String getSample() {
		return sample;
	}

	/**  
	 * 设置sample  
	 * @param sample sample  
	 */
	public void setSample(String sample) {
		this.sample = sample;
	}
}
