package com.mine.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

public class SimpleRunTimeException {

	// Run time exeptions are: Arithmetic, NumberFormat, Null Pointer, IndexOutofBound
	// Compile Time excetions: IO --> FileNotFound, ClassNotFound, SQLException, 
	
	
	public void simpleRTExceptions() throws IOException{
		File f = new File("");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		bf.readLine();
		System.out.println("ArgName:");
		
	}
	
	public static void printDivision(){
		int i=0,j=1,k=0;
		int arrayInt[] = {1,2,3,4,5,6,7,8,9};
		try{
		k=i/j;
		arrayInt[10] = 11;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("k:"+k);
	}
	public static void main(String args[]) throws IOException
	{
		printDivision();
		SimpleRunTimeException st = new SimpleRunTimeException();
		st.simpleRTExceptions();
		
		
	}
	
}
