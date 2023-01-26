package com.jspiders.factorydesingpattern.items;

import com.jspiders.factorydesingpattern.order.Order;

public class Momos implements Order{
	@Override
	public void order() {
		System.out.println("Momos Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Momos is Ready.....!!!");
	}
		

}
