package com.jspiders.hibernate3.manytonoe;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class ManyDTO {
	@Id
	private int id;
	
	private String Name;
	
	private String  city;
	
	private double sallary;

	@ManyToMany
	
	List<OneDTO> onedtos;

}
