package org.xs.dntown.wx.core.modules.entity.req;

/**
 * 接入验证req
 */
public class VerifyAccessReq {
	
	/**
	 * 加密签名
	 */
	private String signature;
	
	/**
	 * 时间戳
	 */
	private String timestamp;
	
	/**
	 * 随机数
	 */
	private String nonce;
	
	/**
	 * 随机字符串
	 */
	private String echostr;

	/**  
	 * 获取signature  
	 * @return signature signature  
	 */
	public String getSignature() {
		return signature;
	}

	/**  
	 * 设置signature  
	 * @param signature signature  
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**  
	 * 获取timestamp  
	 * @return timestamp timestamp  
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**  
	 * 设置timestamp  
	 * @param timestamp timestamp  
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**  
	 * 获取nonce  
	 * @return nonce nonce  
	 */
	public String getNonce() {
		return nonce;
	}

	/**  
	 * 设置nonce  
	 * @param nonce nonce  
	 */
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	/**  
	 * 获取echostr  
	 * @return echostr echostr  
	 */
	public String getEchostr() {
		return echostr;
	}

	/**  
	 * 设置echostr  
	 * @param echostr echostr  
	 */
	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}
}
