package com.mine.Threads;

// Telusko Sample: 

class Hi extends Thread{
	public void show() throws InterruptedException{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi.. "+i);
			Thread.sleep(1000);
		}
	}
	public void run(){
		try {
			show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Hello extends Thread{
	public void show() throws InterruptedException{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello.. "+i);
			Thread.sleep(1100);
		}
	}
	public void run(){
		try {
			show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {

		Hi thread1 = new Hi();
		Hello thread2 = new Hello();
		
		thread1.setName("thread1");
		thread2.setName("thread2");		

		thread1.start();
		thread2.start();
		
	}
}