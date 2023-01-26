package com.jspiders.hibernateallpractice.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class HusbandDTO4 {
	
	@Id
	private int id;
	
	private String name;
	
	private int age;
}
