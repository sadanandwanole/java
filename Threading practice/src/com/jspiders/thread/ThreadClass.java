package com.jspiders.thread;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Threadclass "+ i);
			System.out.println(currentThread().getName());
		}
		super.run();
	}
	public static void main(String[] args) {
		ThreadClass class1=new ThreadClass();
		
		
		RunableInterface interface1=new RunableInterface();
		Thread thread=new Thread(interface1);
		thread.start();
		class1.start();
	}

}
