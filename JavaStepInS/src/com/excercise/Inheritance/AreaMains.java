package com.excercise.Inheritance;

public class AreaMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleCalc tc = new TriangleCalc();

		System.out.println("Triangle Area: "+tc.area(5.0, 10.5));

		System.out.println("Square Area: "+tc.area(5.0));

		RectangleCalc rc = new RectangleCalc();

		System.out.println("Rectangle Area: "+rc.area(5.0, 10.5));

		System.out.println("Square Area: "+rc.area(5.0));

	}

}
