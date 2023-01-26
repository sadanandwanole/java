package com.jspiders.hibernateallpractice.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class WifeDTO4 {

	
	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	@OneToOne
	HusbandDTO4 husband;
}
