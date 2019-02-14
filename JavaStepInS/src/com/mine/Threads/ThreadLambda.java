package com.mine.Threads;

//Telusko Sample: 

public class ThreadLambda {
	
	public static void main(String[] args) throws Exception{

		Runnable r1 = () -> {
			for(int i=0;i<5;i++) 
				System.out.println("hi Lambda.. "+i);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		};

		Runnable r2 = () -> {
			for(int i=0;i<5;i++)
				System.out.println("hello Lambda.. "+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();

		
		System.out.println("bye one");
		
		System.out.println("t1 alive check: "+t1.isAlive());
		System.out.println("t2 alive check: "+t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println("bye main");
		
		
	}
}