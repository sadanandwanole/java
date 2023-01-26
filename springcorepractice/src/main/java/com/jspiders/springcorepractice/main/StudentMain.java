package com.jspiders.springcorepractice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorepractice.bean.StudentPractice;

public class StudentMain {
	
	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
//		StudentPractice bean =(StudentPractice) context.getBean("sada1");
//		System.out.println(bean);
//		((ClassPathXmlApplicationContext)context).close();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("PracticeConfig.xml");
		StudentPractice bean =(StudentPractice) context.getBean("sada2");
		System.out.println(bean);
		((ClassPathXmlApplicationContext)context).close();
		
	}
	

}
