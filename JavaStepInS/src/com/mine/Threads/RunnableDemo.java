package com.mine.Threads;

//Telusko Sample: 

class Hi2 implements Runnable{
	public void show() throws InterruptedException{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi.. "+i);
			Thread.sleep(500);
		}
	}
	public void run(){
		try {
			show();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class Hello2 implements Runnable{
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
			
			e.printStackTrace();
		}
	}
}


public class RunnableDemo {

	public static void main(String[] args) {

		Runnable run1 = new Hi2();
		Runnable run2 = new Hello2();

		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);

		t1.start();
		t2.start();
		
	}

}
