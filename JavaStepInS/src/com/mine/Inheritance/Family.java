package com.mine.Inheritance;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.showHeight();

		Son s = new Son();
		s.showHeight();

		GrandSon g = new GrandSon();
		g.showHeight();
		GrandSon.familyHouse("Bruce Villa");
		g.getFatherAge();
		
		// Shadowing:
		
		g.addProperty();
		System.out.println("g.property: "+g.property);
		
		g.addProperty(g.property);
		System.out.println("g.property: "+g.property);
		
		// polymorphism: 

		Father f1 = new Son();
		f1.showHeight();
		f1.skinColour();
		
		
		Father f2 = new GrandSon();
		f2.showHeight();
	}


}
