package com.mine.KeywordsConcepts;

import com.mine.Constructors.Animal;

class TestMains extends Animal{
	int i = 10;
	public TestMains(){
		stackChecks();
	}
	
	
	public void show(){
		
	}
	//Sample method to return object:
	public TestMains stackChecks(){
		System.out.println("ok got it..");
		return this;
	}

}

public class TestingMains{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMains t = new TestMains();
		System.out.println("t.i :: "+t.i);
	}
}