package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Burger implements Order {
	
	@Override
	public void order() {
		System.out.println("ordering Burger");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Burger is Ready.....!!!");
	}
		

}
