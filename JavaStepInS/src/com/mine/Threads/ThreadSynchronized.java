package com.mine.Threads;
// Telusko :
class Counter {
	
	static int increase = 100;
	int count;

	public synchronized void increment(){
		count++;
	}
	
	public static synchronized void increaser(){
		increase++;
	}
}

public class ThreadSynchronized {

	public static void main(String[] args) throws Exception{
		Counter c = new Counter();
		Thread t1 = new Thread(() ->{
			for(int i=0;i<1000;i++){
				c.increment();
				Counter.increaser();
			}
				
		}, "thread1");

		Thread t2 = new Thread(() ->{
			for(int i=0;i<1000;i++)
				c.increment();
			Counter.increaser();
		}, "thread2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("count : "+c.count);

		System.out.println("increaser : "+Counter.increase);
		
		
	}
}