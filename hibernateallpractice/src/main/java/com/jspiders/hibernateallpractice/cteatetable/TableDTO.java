package com.jspiders.hibernateallpractice.cteatetable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TableDTO {

	@Id
	private int id;
	
	private String name;
	
	private String city;
	
	private long contact;
}
