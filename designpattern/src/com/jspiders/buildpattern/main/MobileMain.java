package com.jspiders.buildpattern.main;

import com.jspiders.buildpattern.MobileBuilder.MobileBuilder;
import com.jspiders.buildpattern.object.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile=new MobileBuilder().Brand("samsung").Price(100000.00).Model("S25").getmobile();
		System.out.println(mobile);
	}

}
