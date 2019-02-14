package com.mine.Abstraction;

public class PhoneMains {

	public static void main(String[] args)
	{
		TouchPhone android = new AndroidPhones();
		android.backKey();
		android.display();
		android.call();

		Phone iPhone = new IPhone();
		iPhone.backKey();
		iPhone.call();
		
		//Phone phone = new Phone();
	}
}
