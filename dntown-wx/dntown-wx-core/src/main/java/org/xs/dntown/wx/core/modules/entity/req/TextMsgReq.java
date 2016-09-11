package org.xs.dntown.wx.core.modules.entity.req;

/**
 * 文本消息req
 */
public class TextMsgReq extends BaseMsgReq {
	
	/**
	 * 文本消息内容
	 */
	private String content;

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
	
	public TextMsgReq() {}
	
	public TextMsgReq(BaseMsgReq baseMsgReq) {
		setToUserName(baseMsgReq.getToUserName());
		setFromUserName(baseMsgReq.getFromUserName());
		setCreateTime(baseMsgReq.getCreateTime());
		setMsgType(baseMsgReq.getMsgType());
		setMsgId(baseMsgReq.getMsgId());
	}
}
