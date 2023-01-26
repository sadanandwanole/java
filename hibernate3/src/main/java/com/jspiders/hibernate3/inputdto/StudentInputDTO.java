package com.jspiders.hibernate3.inputdto;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentInputDTO {
	
	
	
	@Id
	int id;
	
	
	String name;
	
	
	String Email;

}
