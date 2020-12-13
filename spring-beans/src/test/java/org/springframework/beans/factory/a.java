package org.springframework.beans.factory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class a {
	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(null);
		xmlBeanFactory.getBean("aa");
	}
}
