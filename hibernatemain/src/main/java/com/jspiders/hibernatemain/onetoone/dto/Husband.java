package com.jspiders.hibernatemain.onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Husband {

	
	@Id
	private  int id;
	private  String name;
	
}
