package com.mine.myself;

public class Human {

	private String name;
	private int age;
	private char gender;
	private float height;
	private float weight;
	private String nationality;
	private Human human;
	// copy constructor:
	public Human()
	{
		return;
	}
	
	public Human(Human hum)
	{
		//Human human = new Human();
		
		this.human = hum;
		return;
	}
	
	public Human getHuman()
	{
		Human Hu = new Human(1);
		System.out.println("Hu.age : : : "+Hu.age);
		return human;
	}
	
	//private constructor:
	private Human(int age)
	{
		this.age = age;
	}
	// to check how local variable is assigned to an instance variable:
	
	public void checksum(){
		int age=0;
		this.age = age;
	}
	
	public char checkGenderFemale(String name)
	{
		int i=0;
		System.out.println(i);
		System.out.println(name);
		if ((!name.equalsIgnoreCase(null)) && (name.endsWith("a")))
			gender = 'F';
		else if(name.equalsIgnoreCase(null))
			gender = 'N';
		else
			gender = 'M';
		return gender;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


}

