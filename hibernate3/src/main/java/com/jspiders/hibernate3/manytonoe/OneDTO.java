package com.jspiders.hibernate3.manytonoe;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class OneDTO {
	
	@Id
	private int id;
	
	private String name;
	
	private String city;
	@ManyToMany(mappedBy = "onedtos")
	List<ManyDTO> dtos;
	

}
