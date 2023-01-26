package com.jspders.hibernate1dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
	
	@Id
	private int id;
	
	private String name;
	
	private String Email;
	
	private long contact;
	
	private String city;
	
	
	
	

}
