package com.mine.InnerClass;


public class InnerEmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerEmpDetails iDetails = new InnerEmpDetails();

		iDetails.name = "Sugumar";
		iDetails.age = 36;
		iDetails.grade = 3;

		// Inner Class call:
		InnerEmpDetails.Address empAddress = iDetails.new Address();

		empAddress.doorNo = 5;
		empAddress.street = "Pudhu Street";
		empAddress.pincode = 600113;

		System.out.println("Employee pincode: "+empAddress.pincode);

		// Nested Class call:
		InnerEmpDetails.OfficeAddress offAddress = new InnerEmpDetails.OfficeAddress();
		offAddress.officeDoorNo = 10;
		offAddress.officeStreet = "Gandhi Street";
		offAddress.officePincode = 600118;

		System.out.println("Office pincode: "+offAddress.officePincode);

		// Anonymous call: without Lambda

		InnerEmpDetails.SalaryDate forSalary = iDetails.new SalaryDate(){
			public void printSalaryDate(){
				System.out.println("Salary is on every 2nd");
			}
		};

		forSalary.printSalaryDate();

		// Function interface Implementation with Lambda:

		IncentiveFunctional salaryInterface = () -> System.out.println("Incentive is on every 5th");

		salaryInterface.printIncentiveDate();
		
		// Implemented interface:
		
		Appraisal.appraisalCycle();
	}

}
