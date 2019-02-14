package com.mine.InnerClass;

public class InnerEmpDetails {
	String name;
	int age;
	
	// Member Inner Class:
	class Address{
		int doorNo;
		String street;
		String area;
		String city;
		long pincode;
	}
	
	int grade;
	
	// Static Inner Class: also known as Nested Class: 
	static class OfficeAddress{
		int officeDoorNo;
		String officeStreet;
		String officeArea;
		String officeCity;
		long officePincode;
	}

	// Anonymous class:
	
	class SalaryDate{
		public void printSalaryDate(){
			System.out.println("Salary is on every 1st");
		}
	}
}
