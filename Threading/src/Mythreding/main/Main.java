package Mythreding.main;

//import Mythreding.MyThread;
import Mythreding.mythread.MyThread2;

public class Main {
	public static void main(String[] args) {
//		MyThread myThread=new MyThread();
//		myThread.run();
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
	}
	

}
