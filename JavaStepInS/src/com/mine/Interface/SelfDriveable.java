package com.mine.Interface;


public interface SelfDriveable {
	int speedKmHr = 70; // public static final int 
	
	void getLocation(); // public abstract 
	void getDestination(com.mine.InterfaceClasses.Corodinates co);

	void selfDrive();

}
