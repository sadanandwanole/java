package com.jspiders.spring1.onetoone;

import lombok.Data;

@Data
public class ChildBean {
	private int id;
	private String name;
	private int age;
	
	FatherBean father;

}
