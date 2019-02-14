package com.mine.Threads;

class Provider{
	int consume;
	boolean valueSet;
	public synchronized void forProducer(int consume) throws InterruptedException{
		while(valueSet){
			wait();
		}
		this.consume = consume;
		System.out.println("Producer: "+this.consume);
		valueSet = true;
		notify();
	}
	
	public synchronized void forConsumer() throws InterruptedException{
		while(!valueSet){
			wait();
		}
		
		System.out.println("Consume: "+consume);
		valueSet = false;
		notify();
	}
}

public class ThreadInters {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Provider p = new Provider();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<100;i++){
					try {
						p.forProducer(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<100;i++){
					try {
						p.forConsumer();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
	}

}
