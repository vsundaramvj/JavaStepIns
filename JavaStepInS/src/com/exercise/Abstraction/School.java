package com.exercise.Abstraction;

abstract class Schools {

	public void primarySections()
	{
		System.out.println("primary classes goes here.."+this.getClass());
	}
	
	public abstract void hrSecSections();
}

class hrSchool extends Schools {
	
	public void primarySections()
	{
		System.out.println("primary classes in hrSchool goes here.."+this.getClass());
	}
	
	public void hrSecSections()
	{
		System.out.println("hr. Sec classes goes here..");
	}
	
	public void otherClasses(){
		System.out.println("Cricket coaching available..");
	}
}

class hrSecSchool extends Schools{
	public void hrSecSections()
	{
		System.out.println("hr. Secondary classes goes here..");
	}
	
	public void college(){
		System.out.println("Junior college is included..");
	}
}	
public class School{

	public static void main(String[] ars)
	{
		Schools ss = new hrSchool();
		System.out.println("============================================================");
		ss.hrSecSections();
		ss.primarySections();
		System.out.println("============================================================\n");
		
		Schools hrSec = new hrSecSchool();
		System.out.println("============================================================");
		hrSec.hrSecSections();
		hrSec.primarySections();
		System.out.println("============================================================\n");
		
		hrSchool hrSc = new hrSchool();
		System.out.println("============================================================");
		hrSc.otherClasses();
		hrSc.primarySections();
		System.out.println("============================================================");
		
		
		hrSecSchool hrNat = new hrSecSchool();
		hrNat.primarySections();
		
	}
	
}
