package Mythreding.mythread;

//import Mythreding.MyThread;

public class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("this is an Mythread 2");
		}
		
		
	}
	
}
