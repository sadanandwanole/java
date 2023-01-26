package com.jspiders.hibernate3.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ChildDTO {
	
	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	private int contact;

}
