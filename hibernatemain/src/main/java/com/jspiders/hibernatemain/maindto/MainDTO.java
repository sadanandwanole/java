package com.jspiders.hibernatemain.maindto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MainDTO {
	@Id
	private int id;
	
	private String name;
	
	
	private long sallary;
	
	
	private String city;

}
