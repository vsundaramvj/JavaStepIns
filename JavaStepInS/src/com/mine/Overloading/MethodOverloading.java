package com.mine.Overloading;

public class MethodOverloading {

	//int: 
	
	public int multiply(int i, int j)
	{
		return i*j;
	}
	
	// Float:
	
	public float multiply(float i, float j)
	{
		return i*j;
	}
	

	public float multiply(int i, float j)
	{
		return i*j;
	}
	
	static float multiply(float i, int j)
	{
		return i*j;
	}
	
	protected final float multiply(float i, float j, float k) throws Exception
	{
		return i*j*k;
	}
	
}
