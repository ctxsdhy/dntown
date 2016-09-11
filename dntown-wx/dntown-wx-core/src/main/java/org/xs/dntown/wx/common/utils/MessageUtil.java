package org.xs.dntown.wx.common.utils;

import java.io.InputStream;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xs.dntown.wx.core.modules.entity.req.BaseMsgReq;
import org.xs.dntown.wx.core.modules.entity.res.TextMsgRes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * 微信消息帮助类
 */
public class MessageUtil {
	
	/**
	 * 扩展xstream，使其支持CDATA块
	 */
	private static XStream xstream = new XStream(new XppDriver() {
		public HierarchicalStreamWriter createWriter(Writer out) {
			return new PrettyPrintWriter(out) {
				// 对所有xml节点的转换都增加CDATA标记
				boolean cdata = true;
				public void startNode(String name, @SuppressWarnings("rawtypes") Class clazz) {
					super.startNode(name, clazz);
				}
				protected void writeText(QuickWriter writer, String text) {
					if (cdata) {
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					} else {
						super.writeText(writer, text);
					}  
				}  
			};  
		}  
	});
	

	/**
	 * 解析微信发来的xml请求
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {
		//将解析结果存储在HashMap中
		Map<String, String> map = new HashMap<String, String>();
		//从request中取得输入流
		InputStream inputStream = request.getInputStream();
		//读取输入流
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		//得到xml根元素
		Element root = document.getRootElement();
		//得到根元素的所有子节点
		List<Element> elementList = root.elements();
		//遍历所有子节点
		for (Element e : elementList) {
			map.put(e.getName(), e.getText());
		}
		//释放资源
		inputStream.close();
		inputStream = null;
		return map;
	}
	
	/**
	 * 文本消息对象转换成xml
	 * @param textMsgRes
	 * @return
	 */
	public static String textMessageToXml(TextMsgRes textMsgRes) {
		xstream.alias("xml", textMsgRes.getClass());
		return xstream.toXML(textMsgRes);
	}
	
	/**
	 * 接收消息对象转换成xml
	 * @param msgReq
	 * @return
	 */
	public static String msgReqToXml(BaseMsgReq msgReq, String content) {
		TextMsgRes textMsgRes = new TextMsgRes();
		textMsgRes.setToUserName(msgReq.getFromUserName());
		textMsgRes.setFromUserName(msgReq.getToUserName());
		textMsgRes.setCreateTime(new Date().getTime());
		textMsgRes.setMsgType("text");
		textMsgRes.setContent(content);
		return textMessageToXml(textMsgRes);
	}
}
