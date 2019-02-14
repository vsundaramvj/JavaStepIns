package com.mine.Exceptions.Telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ArithmeticException;
import java.lang.Integer;

public class DemoException extends DemoExceptionExecution{

	public static void main(String args[])
	{
		int  i=1,j=1,k;
		int array[] = {1,2,3,4}; 
		
		//	String inputSystem = Integer.toString(System.in.read());
		//	int iParse = Integer.parseInt("132");
		try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in));){

			System.out.println("Enter a number for j: ");
			//NumberFormatException - IO type:
			int je = Integer.parseInt(br.readLine());

			// Arithmetic:

			k=i/je;

			// throws and throw sample: 
			DemoExceptionExecution dee = new DemoExceptionExecution();
			if(k==1) throw new DemoExceptionClass();
			checkForK(k);
			//ArrayIndex: 

			array[0] = 5;

		}catch(ArithmeticException e)
		{
			System.out.println(e + "\n\nCannot divide my Zero.");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" \n\n larger than the array capacity..");
		}catch(IOException e)
		{
			System.out.println(e+" \n\n IO Exception..");
		}catch(NumberFormatException e)
		{
			System.out.println(e+"\n Number Format is not right.. Run time exception..");
		}
		catch(Exception e)
		{
			System.out.println(e+"\n exception on general type!!");
			
		}
		
	}	
	
	public static void checkForK(int k) throws RuntimeException{
		if(k<1) throw new RuntimeException("from checkForK = 1");
	}
}

class DemoExceptionClass extends IOException{
 
	
	public DemoExceptionClass(){
		super();
		printException();
	}
	public void printException()
	{
		System.out.println("Inside my method");
	}
}

class DemoExceptionExecution {
	
}

class AutoClose implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}