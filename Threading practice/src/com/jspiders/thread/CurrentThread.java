package com.jspiders.thread;

public class CurrentThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("current thread is : "+i);
			System.out.println(currentThread().getName());
			
		}
		
		
	}
	public static void main(String[] args) {
		CurrentThread currentThread=new  CurrentThread();
		currentThread.setName("mohini");
		
		ThreadClass class1=new ThreadClass();
		class1.setName("aaaaaaaa");
		class1.start();
		
		currentThread.start();
		try {
			currentThread.wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
