package com.jspiders.spring.main;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.bean.StudentBean;

public class StudentMain { 
	public static void main(String[] args) {
		
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("StudentBeanConfig.xml");
//		 StudentBean student = context.getBean(StudentBean.class);
//		 System.out.println(student);
//		 ((ClassPathXmlApplicationContext)context).close();
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("StudentBeanConfig.xml");
//		 StudentBean student =(StudentBean) context.getBean("student1");
//		 System.out.println(student);
//		 ((ClassPathXmlApplicationContext)context).close();
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("StudentBeanConfig.xml");
//		 StudentBean student =(StudentBean) context.getBean("student2");
//		 System.out.println(student);
//		 ((ClassPathXmlApplicationContext)context).close();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentBeanConfig.xml");
		 StudentBean student =(StudentBean) context.getBean("student3");
		 System.out.println(student);
		 ((ClassPathXmlApplicationContext)context).close();
	}

}
