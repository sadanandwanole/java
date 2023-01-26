package com.jspiders.factorydesingpattern.main;

import java.util.Scanner;

import com.jspiders.factorydesingpattern.items.Burger;
import com.jspiders.factorydesingpattern.items.Coffee;
import com.jspiders.factorydesingpattern.items.Fries;
import com.jspiders.factorydesingpattern.items.Momos;
import com.jspiders.factorydesingpattern.items.Pasta;
import com.jspiders.factorydesingpattern.items.Pizza;
import com.jspiders.factorydesingpattern.order.Order;

public class Cafe {
	private static Order order;
	private static boolean loop=true;
	private static int choice;
	 private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		 while (loop) {
			 try{
				 factory().order();
			 }
			 catch(NullPointerException e) {
			 System.out.println("No oredr Recieved.....!!!!");
			 }
		 }
	}
		 
	private static Order factory() {
		 
		 
			 System.out.println("===============================Menu=====================================\n"
				 		+ "1) Pizza \n"
				 		+ "2) Burger \n"
				 		+ "3) Fries \n"
				 		+ "4) Coffee \n"
				 		+ "5) Momos \n"
				 		+ "6) Pasta \n"
				 		+ "7) Exit ");
			 
			 choice =scanner.nextInt(); 
			 switch (choice) {
			case 1:
				order=new Pizza();
				break;
			case 2:
				order=new Burger();
				break;
			case 3:
				order=new Fries();
				break;
			case 4:
				order=new Coffee();
				break;
			case 5:
				order=new Momos();
				break;
			case 6:
				order=new Pasta();
				break;
			case 7:
				System.out.println("thank you for using.......!Visit Again.....!!!!!!!!!");
				loop=false;
				order=null;
				break;
			default:
				System.out.println("please choose correct option");
				break;
			}
			return order;
	}
		
	}

