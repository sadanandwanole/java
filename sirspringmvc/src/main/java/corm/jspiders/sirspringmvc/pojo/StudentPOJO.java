package corm.jspiders.sirspringmvc.pojo;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class StudentPOJO {
	private long id;
	private String filename;
	private byte [] data;
	

}
