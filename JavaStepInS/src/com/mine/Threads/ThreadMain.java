package com.mine.Threads;

public class ThreadMain extends Thread{
	static int[] to2 = new int[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=0;i<5;i++)
		{
			to2[i] = i+1;
			System.out.println(" i: "+i+" to2[i]: "+to2[i]);
		}
		
		Thread t1 = new ThreadMain();
		Thread t2 = new ThreadMain();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}
	
	public void run(){
		System.out.println("Running Thread: "+Thread.currentThread());
		
		for(int i=0; i<5;i++)
		{
			to2[i] = to2[i] * 2;
			System.out.println("In Thread: "+Thread.currentThread()+" i: "+i+" to2[i]: "+to2[i]);
		}
		
		
	}

}
