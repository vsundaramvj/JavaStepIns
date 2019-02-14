package com.mine.Interface;

import com.mine.InterfaceClasses.Corodinates;

public class FlyImpl implements Flyable{

	@Override
	public void getLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDestination(Corodinates co) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly(String from) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] s)
	{
		Flyable f1 = new FlyImpl();
		
		f1.flyHigh();
	}
	

}
