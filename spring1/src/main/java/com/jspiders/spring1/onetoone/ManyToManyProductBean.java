package com.jspiders.spring1.onetoone;

import java.util.List;

import lombok.Data;

@Data
public class ManyToManyProductBean {
	private int id;
	private String name;
	private int price;
	
	List<ManyToManyCustomerBean> customers;

}
