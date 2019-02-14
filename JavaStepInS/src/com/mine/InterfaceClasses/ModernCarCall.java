package com.mine.InterfaceClasses;

import com.mine.Interface.Flyable;
import com.mine.Interface.SelfDriveable;

public class ModernCarCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModernCar mc = new ModernCar();
		mc.getLocation();
		
		Corodinates cPoint = null;
		mc.getDestination(cPoint);
		mc.selfDrive();
		mc.fly("Hogwards");
		mc.flyHigh();
		
		SelfDriveable sdcar = new ModernCar();
		cPoint = new Corodinates();
		sdcar.getDestination(cPoint);
		
		Flyable flyCar =  new ModernCar();
		flyCar.fly("Chennai");
		flyCar.flyHigh();
		
		
	}

}
