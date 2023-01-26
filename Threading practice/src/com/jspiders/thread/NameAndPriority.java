package com.jspiders.thread;

public class NameAndPriority extends Thread{
	@Override
	public void run() {
	
		System.out.println("the name of the thread is  : "+getName());
		System.out.println("the priority of the thread is  : "+getPriority());
	}
	
	public static void main(String[] args) {
		
		NameAndPriority priority=new NameAndPriority();
		priority.setName("sadanand");
		priority.setPriority(10);
		priority.start();
		
	}

}
