package com.jspiders.spring1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring1.onetoone.ChildBean;

public class FatherChildMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ManyToOne.xml");
		ChildBean child1=(ChildBean)context.getBean("child1");
		ChildBean child2=(ChildBean)context.getBean("child2");
		System.out.println(child1);
		System.out.println(child2);
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
