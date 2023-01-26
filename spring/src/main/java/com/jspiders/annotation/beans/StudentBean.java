package com.jspiders.annotation.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {
	
	@Value("4")
	private int id;
	
	@Value("vikas")
	private String name;
	@Value("Vikas@gmail.com")
	private String email;
	@Value("pune")
	private String city;

}
