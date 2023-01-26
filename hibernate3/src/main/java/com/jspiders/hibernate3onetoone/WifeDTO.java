package com.jspiders.hibernate3onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity

@Data
public class WifeDTO {

	
	@Id
	private  int id;

	private  String name;

	private  int age;

	private  long contact;

}
