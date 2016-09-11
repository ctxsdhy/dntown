package org.xs.dntown.wx.core.modules.entity.req;

/**
 * 接收消息基类req
 */
public class BaseMsgReq {

	/**
	 * 开发者微信
	 */
	private String toUserName;
	
	/**
	 * 发送方帐号（一个OpenID）
	 */
	private String fromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private String createTime;
	
	/**
	 * 消息类型
	 */
	private String msgType;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;
	
	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件key
	 */
	private String eventKey;
	
	/**
	 * 二维码ticket
	 */
	private String ticket;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**  
	 * 获取toUserName  
	 * @return toUserName toUserName  
	 */
	public String getToUserName() {
		return toUserName;
	}

	/**  
	 * 设置toUserName  
	 * @param toUserName toUserName  
	 */
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	/**  
	 * 获取fromUserName  
	 * @return fromUserName fromUserName  
	 */
	public String getFromUserName() {
		return fromUserName;
	}

	/**  
	 * 设置fromUserName  
	 * @param fromUserName fromUserName  
	 */
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	/**  
	 * 获取createTime  
	 * @return createTime createTime  
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**  
	 * 设置createTime  
	 * @param createTime createTime  
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**  
	 * 获取msgType  
	 * @return msgType msgType  
	 */
	public String getMsgType() {
		return msgType;
	}

	/**  
	 * 设置msgType  
	 * @param msgType msgType  
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	/**  
	 * 获取msgId  
	 * @return msgId msgId  
	 */
	public String getMsgId() {
		return msgId;
	}

	/**  
	 * 设置msgId  
	 * @param msgId msgId  
	 */
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	/**  
	 * 获取event  
	 * @return event event  
	 */
	public String getEvent() {
		return event;
	}

	/**  
	 * 设置event  
	 * @param event event  
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**  
	 * 获取eventKey  
	 * @return eventKey eventKey  
	 */
	public String getEventKey() {
		return eventKey;
	}

	/**  
	 * 设置eventKey  
	 * @param eventKey eventKey  
	 */
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	/**  
	 * 获取ticket  
	 * @return ticket ticket  
	 */
	public String getTicket() {
		return ticket;
	}

	/**  
	 * 设置ticket  
	 * @param ticket ticket  
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
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
}
