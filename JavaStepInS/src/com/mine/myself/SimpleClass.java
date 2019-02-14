package com.mine.myself;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class SimpleClass	{
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		System.out.println("live.. let live.. ");

		// fully qualified class name:

		Class c = java.util.ArrayList.class;
		String className = c.getName();
		System.out.println("The fully-qualified name of the class is: " + SimpleClass.class.getName());

		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yy hh:mm:ss");
		Date date = new Date();
		System.out.println("Sys date: "+LocalDateTime.now());


		System.out.println("Globe date: "+d.format(date));
		chek:
			for(int i=0;i<10;i++)
			{

				if(i==3)continue;
				System.out.println("i"+i);
				if(i==6)break;
				break chek;
			}
		SimpleClass s = new SimpleClass();
		s.change();

		int[] a = {10,20,30,40,50};
		/*	OptionalDouble sum = IntStream.of(a).average();
		System.out.println("The sum is " + sum);
		 */		
		for(int x:a)
		{
			if(x==50) break;
			System.out.println("x:a :: "+x);
		}

		for(int x=0; x < a.length;x++)
		{
			if (a[x]==50) break;
			if(x==3) break;
			System.out.println("x:a old for :: "+a[x]);
		}

		Human agatha = new Human();
		char genders = agatha.checkGenderFemale("agatha");
		System.out.println("Gender:: "+((genders=='F')?"Female":"Male"));

		// pre post increment
		int count=0;
		System.out.println("count++: "+count++);
		System.out.println("count: after count++: "+count);
		count=0;
		System.out.println(++count);
		System.out.println("count: after ++count: "+count);
	}	

	public static void main2(String n)
	{
		System.out.println("main2 print n : "+n);
	}

	public void change()
	{
		byte byt = 0;
		byt = 1;
		byt = 9;
		System.out.println("byt: "+byt);
		System.out.println("Change Method");
		SimpleClass.main2("newdress");
	}

}
