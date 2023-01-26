package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Fries implements Order{
	@Override
	public void order() {
		System.out.println("Fries Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fries is Ready.....!!!");
	}
		

}
