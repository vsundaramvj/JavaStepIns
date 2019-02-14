package com.mine.staticAndfinal;

public class StaticAndFinalMain {

public static void main(String ars[])
{
	StaticClass sc = new StaticClass();
	StaticClass sc1 = new StaticClass();
	for(int i =0;i<5;i++)
	{
		
		StaticClass sc2 = (StaticClass) new StaticClass();
	}
	// in the above case only two objects created.
	
	FinalClass fc = new FinalClass(50);
	FinalClass fc1 = new FinalClass(45);

	StaticFinal sfc = new StaticFinal();
	StaticFinal sfc1 = new StaticFinal();
}
}