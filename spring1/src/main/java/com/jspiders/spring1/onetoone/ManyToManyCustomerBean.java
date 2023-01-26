package com.jspiders.spring1.onetoone;

import java.util.List;

import lombok.Data;

@Data
public class ManyToManyCustomerBean {
	private int id;
	private String name;
	private String email;
	
	List<ManyToManyProductBean> products;
	

}
