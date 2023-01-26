package com.qspiders.structuraldesignpattern;

import com.qspiders.structuraldesignpattern.Interface.Mock;
import com.qspiders.structuraldesignpattern.object.Wejm4;

public class Adapter extends Wejm4 implements Mock{
	static Adapter adapter=new Adapter();
	public static void main(String[] args) {
		adapter.rating();
		
	}
	@Override
	public void rating() {
		
		adapter.setId(1);
		adapter.setName("SADANAND");
		adapter.setTech_rating("*");
		adapter.setComm_rating("1");
		
		System.out.println(adapter.getName()+"Has tachnical rating has: "
				+ adapter.getTech_rating()+"and Communication rating has: "
						+ adapter.getComm_rating());
	}

}
