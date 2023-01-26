package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.onetoone.ManyToManyProductBean;

public class ProductCustomerMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ProductCustomerConfig.xml");
		ManyToManyProductBean bean =(ManyToManyProductBean) context.getBean("product1");
		System.out.println(bean);
		((ClassPathXmlApplicationContext) context).close();
	}

}
