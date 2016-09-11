package org.xs.dntown.wx.core.modules.entity.res;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 消息基类res
 */
public class BaseMsgRes {
	
	/**
	 * 接收方帐号（收到的OpenID）
	 */
	@XStreamAlias("ToUserName")
	private String ToUserName;
	
	/**
	 * 开发者微信号
	 */
	@XStreamAlias("FromUserName")
	private String FromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	@XStreamAlias("CreateTime")
	private long CreateTime;
	
	/**
	 * 消息类型
	 */
	@XStreamAlias("MsgType")
	private String MsgType;
	
	/**  
	 * 获取toUserName  
	 * @return toUserName toUserName  
	 */
	public String getToUserName() {
		return ToUserName;
	}

	/**  
	 * 设置toUserName  
	 * @param toUserName toUserName  
	 */
	public void setToUserName(String toUserName) {
		this.ToUserName = toUserName;
	}

	/**  
	 * 获取fromUserName  
	 * @return fromUserName fromUserName  
	 */
	public String getFromUserName() {
		return FromUserName;
	}

	/**  
	 * 设置fromUserName  
	 * @param fromUserName fromUserName  
	 */
	public void setFromUserName(String fromUserName) {
		this.FromUserName = fromUserName;
	}

	/**  
	 * 获取createTime  
	 * @return createTime createTime  
	 */
	public long getCreateTime() {
		return CreateTime;
	}

	/**  
	 * 设置createTime  
	 * @param createTime createTime  
	 */
	public void setCreateTime(long createTime) {
		this.CreateTime = createTime;
	}

	/**  
	 * 获取msgType  
	 * @return msgType msgType  
	 */
	public String getMsgType() {
		return MsgType;
	}

	/**  
	 * 设置msgType  
	 * @param msgType msgType  
	 */
	public void setMsgType(String msgType) {
		this.MsgType = msgType;
	}
}
