package com.jspiders.annotation.cogif;

import org.springframework.context.annotation.Bean;

import com.jspiders.annotation.beans.StudentBean;

public class StudentConfig {
	@Bean
	public StudentBean getStudentBean() {
		StudentBean student =new StudentBean();
		student.setId(1);
		student.setName("sada");
		student.setEmail("Sda@gmail.com");
		student.setCity("pune");
		return student;
		
	}
	@Bean("student1")
	public StudentBean getStudent1() {
		return new StudentBean(2,"mohit","mohit@gmail.com","pune");
		
	}

}
