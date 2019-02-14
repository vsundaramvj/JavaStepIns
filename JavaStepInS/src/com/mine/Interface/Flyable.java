package com.mine.Interface;

import com.mine.InterfaceClasses.Corodinates;

public interface Flyable {
	void getLocation();
	void getDestination(Corodinates co);
	void fly(String from);
	default void flyHigh(){
		System.out.println("This car is flying high with interface..");
	}
}
