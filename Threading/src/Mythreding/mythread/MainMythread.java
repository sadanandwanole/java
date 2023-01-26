package Mythreding.mythread;

public class MainMythread {
	public static void main(String[] args) {
		MyThread1 m=new MyThread1();
		MyThread2 m2=new MyThread2();
		m.start();
		m2.start();
	}

}
