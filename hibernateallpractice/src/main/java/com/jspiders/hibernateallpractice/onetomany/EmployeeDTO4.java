package com.jspiders.hibernateallpractice.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EmployeeDTO4 {

	@Id
	private int id;
	
	private String name;
	
	private double sallary;
	

}
