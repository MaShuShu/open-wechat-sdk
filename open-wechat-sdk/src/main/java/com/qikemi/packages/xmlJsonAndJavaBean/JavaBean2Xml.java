package com.qikemi.packages.xmlJsonAndJavaBean;

import org.apache.log4j.Logger;

import com.qikemi.packages.xmlJsonAndJavaBean.xstream.XstreamUtil;
import com.thoughtworks.xstream.XStream;

/**
 * 
 * Create Date: 2014年9月28日 下午8:24:06
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class JavaBean2Xml {
	
	// logger 
	private static Logger logger = Logger.getLogger(JavaBean2Xml.class);

	public static String convert2Xml(Object object){
		XStream xstream = XstreamUtil.getXStream();
		return xstream.toXML(object);
	}
	
	public static String convert2Xml(Object object, String root){
		XStream xstream = XstreamUtil.getXStream();
		xstream.alias(root, object.getClass());
		String xml = xstream.toXML(object);
//		logger.debug("Wechat Interface Return XML -->\r\n");
		return xml;
	}
}
