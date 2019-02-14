package com.mine.Overloading;

public class MethodOverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		
		System.out.println(m.multiply(1, 2));
		System.out.println(m.multiply(1.0f, 6));
		System.out.println(m.multiply(6, 1.6f));
		System.out.println(m.multiply(6.5f, 5.5f));
		
		
		try {
			System.out.println(m.multiply(6.5f, 5.5f,4.9f));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MethodOverloadChild mc = new MethodOverloadChild();
		System.out.println("------------------------MC--------------------");
		System.out.println(mc.multiply(0.1,0.5));
		System.out.println(mc.multiply(1, 2));
		System.out.println(mc.multiply(1.0f, 6));
		System.out.println(mc.multiply(6, 1.6f));
		System.out.println(mc.multiply(6.5f, 5.5f));
		
		MethodOverloading mcdad = new MethodOverloadChild();
		
		// System.out.println(mcdad.multiply(0.1,0.5)); --> not allowed
		System.out.println(mcdad.multiply(1, 2));
		System.out.println(mcdad.multiply(1.0f, 6));
		System.out.println(mcdad.multiply(6, 1.6f));
		System.out.println(mcdad.multiply(6.5f, 5.5f));
		
	}

}
