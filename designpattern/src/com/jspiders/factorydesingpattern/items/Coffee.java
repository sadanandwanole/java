package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Coffee implements Order{
	@Override
	public void order() {
		System.out.println("Coffee Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cooffee is Ready.....!!!");
	}
		

}
