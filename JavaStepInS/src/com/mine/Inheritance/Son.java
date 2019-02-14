package com.mine.Inheritance;

public class Son extends Father{

	// overridden
	public void showHeight(){
		System.out.println("Son's height is 5.5");
	}
	
	//overloaded 
	public void showHeight(int i){
		System.out.println("Son's height is "+i+" overloaded");
	}
	
	public void addProperty(){
		property = 1000;
	}
}
