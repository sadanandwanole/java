package com.jspiders.thread;

public class RunableInterface implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "Runnable Interface ");
		}

	}
	public static void main(String[] args) {
		RunableInterface interface1=new RunableInterface();
		Thread thread=new Thread(interface1);
		thread.start();
		
	}

}
