package com.mine.Abstraction;

public abstract class Phone {
	
	public Phone(){
		System.out.println("hey there..");
	}
	public void call(){
		System.out.println("Calling..");
	}
	
	public abstract void backKey();
}
