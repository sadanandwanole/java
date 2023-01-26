package com.jspiders.hibernate3.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student1DTO {
	@Id
	private int id;
	
	private String name;
	
	private long contact;
	
	private String DOB;

}
