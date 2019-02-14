package com.mine.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

// to write exceptions in nested way:

public class NestedException {
	
	int k;

	public NestedException nestedExpSample(int i, int j)
	{
		
		try{
			k=i/j;
			try(FileReader fr = new FileReader("F:/JavaFiles/JavaStepInS/src/com/mine/Exceptions/classCheck.txt");){
				CharBuffer c = null;
				fr.read(c);
			}catch(FileNotFoundException fe){
				fe.printStackTrace();
			}catch(IOException ioe)
			{
				ioe.printStackTrace();
				
			}
			
		}catch(ArithmeticException ae){
			
			ae.printStackTrace();
		}finally{
			k=1;
		}
		return this;
	}
}
