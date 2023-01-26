package com.jspiders.hibernate3.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class FatherDTO {
	@Id
	
	
	private int id;
	
	private String name;
	
	
	private int age;
	
	@OneToMany
	List<ChildDTO> children;

}
