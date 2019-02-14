package com.mine.Inheritance;

public class Father {
	private int fatherAge;

	// Shadowing:
	public int property;
	
	public void addProperty(){
		property = 100;
	}
	
	public void addProperty(int i){
		property += 100;
	}
	
	public void skinColour()
	{
		System.out.println("Father's skin colour is white");
	}

	public void showHeight(){
		System.out.println("Father's height is 5.9");
	}

	public final void familyName(){
		System.out.println("family name is George");
	}

	public static void familyHouse(String str){
		System.out.println("family house is "+str);
	}


	public int getFatherAge() {
		return fatherAge;
	}

	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}

}
