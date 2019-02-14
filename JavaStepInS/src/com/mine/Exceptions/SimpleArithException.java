package com.mine.Exceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleArithException {
	
	void testing(){
		Integer i=12;
		int four=4;
		Character c;
		
		i= new Integer(5);
		String str = Integer.toHexString(i);
		four=i;
	}
	
	
	void check(){
		ArrayList k = new ArrayList<String>();
		k= new ArrayList<Integer>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exception Sample:
		
		int i,j,k = 0;
		
		i =10;
		j=0;
		int ar[] = {1};
		
		
		try {
			
			try{
				ar[30] = 20;
			}finally{System.out.println("print easy!!");}
			
			// try without either finally or catch is even possible but only on run time.. 
			//compile time will force
			
			k = i/j;
			
			System.out.println("k is : "+k);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic: "+e);
			System.exit(0);
		}
		
		finally{
			System.out.println("I will exeute any way..");
		}
		
		System.out.println("k outside is : "+k);
	}

}
