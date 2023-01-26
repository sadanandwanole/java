package com.jspiders.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.annotation.beans.StudentBean;
import com.jspiders.annotation.cogif.StudentConfig;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student =(StudentBean) context.getBean("student1");
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
		
	}

}
