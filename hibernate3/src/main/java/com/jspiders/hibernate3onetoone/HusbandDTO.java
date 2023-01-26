package com.jspiders.hibernate3onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data

public class HusbandDTO {
	
	@Id
	
	private  int id;
	
	private  String name;
	
	
	private  int age;
	

	private  long contact; 
	
	@OneToOne
	
	WifeDTO wifeDTO;
}
