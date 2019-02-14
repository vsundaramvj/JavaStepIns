package com.mine.InterfaceClasses;

import com.mine.Interface.Flyable;
import com.mine.Interface.SelfDriveable;

public class ModernCar implements SelfDriveable,Flyable{ 

	Corodinates cPoint;

	public void getLocation(){
		System.out.println("Current location is : "+600010);
	}

	public Corodinates getCoordinates()
	{
		cPoint = new Corodinates();
		cPoint.setLeft(65.0);
		cPoint.setRight(55.0);
		return cPoint;
	}

	public void getDestination(Corodinates cPoint)
	{
		this.cPoint = cPoint;
		if(cPoint==null)cPoint=getCoordinates();
		cPoint.getLeft();
		cPoint.getRight();
		System.out.println("Cpoints : : left ::  "+cPoint.getLeft()+" Right : : "+cPoint.getRight());
	}

	public void selfDrive(){
		System.out.println("drive car @ : "+speedKmHr);
	}

	public void fly(String from){
		System.out.println("Car can fly from : "+from);
	}

	
	/*public void flyHigh(){
		System.out.println("Car can fly HIGH from : ");
	}
*/

}
