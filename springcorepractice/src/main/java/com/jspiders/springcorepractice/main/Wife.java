package com.jspiders.springcorepractice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorepractice.bean.Husband;

public class Wife {
	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
//		Husband husband = context.getBean(Husband.class);
//		System.out.println(husband);
//		((ClassPathXmlApplicationContext)context).close();
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
//		Husband husband=(Husband)context.getBean("husband1");
//		System.out.println(husband);
//		((ClassPathXmlApplicationContext)context).close();
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
//		Husband husband =(Husband) context.getBean("husband2");
//		System.out.println(husband);
//		((ClassPathXmlApplicationContext)context).close();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
		Husband husband =(Husband) context.getBean("husband3");
		System.out.println(husband);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
