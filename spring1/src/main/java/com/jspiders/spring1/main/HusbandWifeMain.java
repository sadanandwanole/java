package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.onetoone.HusbandBean;

public class HusbandWifeMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("OneToOneConfig.xml");
		 HusbandBean bean = (HusbandBean)context.getBean("husband1");
		 System.out.println(bean);
		 ((ClassPathXmlApplicationContext)context).close();
				
	}

}
