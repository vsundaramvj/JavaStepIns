package com.mine.myself;

class HumanProt{}


public class HumanMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hum = new Human();
		hum.setAge(5);
		System.out.println("hum.getAge() : "+hum.getAge());
		
		Human hum2 = new Human(hum);
		System.out.println("hum2.getAge() : "+hum2. getAge());
		
		Human hum3 = new Human();
		hum.setAge(3);
		hum3=hum;
		System.out.println("hum3 age:: "+hum3.getAge());
		hum3.setAge(6);
		System.out.println("hum3 age 6:: "+hum3.getAge());
		System.out.println("hum age:: "+hum.getAge());
		
		
		
	}

}
