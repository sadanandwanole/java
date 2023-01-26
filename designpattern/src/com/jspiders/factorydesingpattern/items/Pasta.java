package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Pasta implements Order{
	@Override
	public void order() {
		System.out.println("Pasta Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pasta is Ready.....!!!");
	}
		

}
