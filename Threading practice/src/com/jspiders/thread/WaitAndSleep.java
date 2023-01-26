package com.jspiders.thread;

public class WaitAndSleep extends Thread{
	
	public static void main(String[] args) {
		WaitAndSleep sleep1=new WaitAndSleep();
		String sada="sadanand wanole";
		for(int i=0;i<sada.length();i++) {
			char b=sada.charAt(i);
			try {
				Thread.sleep(300);
				System.out.print(b);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
