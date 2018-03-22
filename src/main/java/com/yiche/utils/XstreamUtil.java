package com.yiche.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.yiche.pojo.*;

/**
 * xml操作以及发送xml操作
 * @author kouyy
 */
public class XstreamUtil {
	
	/**
	 * 为Class起别名
	 * @param xStream
	 */
	private static void aliasXStream(XStream xStream){
		xStream.alias("Messages", ConsumerMsg.class);
		xStream.alias("HeaderEntry", HeaderEntry.class);
		xStream.alias("BodyEntry", BodyEntry.class);
		xStream.alias("OperaterInfoEntry", OperaterInfoEntry.class);
		xStream.alias("FriendEntry", FriendEntry.class);
	}
   
	
	/**
	 * 解析返回object
	 * @param strXml 待解析xml
	 * @return Object 解析后的对象
	 */
	public static Object parseXmlToObject(String strXml){
		XStream xStream = new XStream(new DomDriver());
		aliasXStream(xStream);
		Object object;
		try {
			object = xStream.fromXML(strXml);
		} catch (RuntimeException e) {
			throw new RuntimeException("XML格式有误,无法解析成对象: " + e.getMessage(),e);
		}
		return object;
	}
	
	
}
