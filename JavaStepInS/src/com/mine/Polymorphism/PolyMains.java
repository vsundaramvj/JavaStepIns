package com.mine.Polymorphism;

public class PolyMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruthi m = new Maruthi();
		m.show();
		m.show(1);
		
		
		// with parent object:
		
		Car c = new Maruthi();
		
		c.show();
		c.showCar();
		
		
		// multi level inheritance:
		
		SwiftDrize s = new SwiftDrize();
		
		s.show();
		s.show(6);
		s.showCar();
		
		Car c1 = new SwiftDrize();
		
		c1.show();
		c1.showCar();
		
		Maruthi m1 = new SwiftDrize();
	
		m1.show();
		m1.show(6);
		m1.showCar();
		
		/* parent p = new child();
		 * 
		 * methods in parent and child --> available
		 * 
		 * methods in parent --> available
		 * 
		 * methods in child alone --> not available
		 * 
		 * 
		 * */
				
		
	}

}
