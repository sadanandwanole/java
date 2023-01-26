package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Pizza implements Order {

	@Override
	public void order() {
		System.out.println("ordering Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pizza is Ready.....!!!");
		
	}

}
