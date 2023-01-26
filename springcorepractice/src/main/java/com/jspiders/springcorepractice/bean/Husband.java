package com.jspiders.springcorepractice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Husband {
	int id;
	String name;
	int age;
	long contact;
}
