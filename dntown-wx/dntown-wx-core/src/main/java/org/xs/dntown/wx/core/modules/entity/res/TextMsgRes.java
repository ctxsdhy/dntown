package org.xs.dntown.wx.core.modules.entity.res;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TextMsgRes extends BaseMsgRes {
	
    /**
     * text消息res
     */
	@XStreamAlias("Content")
    private String Content;
	
	/**  
	 * 获取content  
	 * @return content content  
	 */
	public String getContent() {
		return Content;
	}

	/**  
	 * 设置content  
	 * @param content content  
	 */
	public void setContent(String content) {
		this.Content = content;
	}
}
