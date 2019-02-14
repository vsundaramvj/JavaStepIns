package com.mine.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class MultipleException {

	public int k;


		public MultipleException multiExpSample(int i, int j)
		{
			try(FileReader fr = new FileReader("F:/JavaFiles/JavaStepInS/src/com/mine/Exceptions/classCheck2.txt");){
				CharBuffer c = null;
				fr.read(c);
			}catch(FileNotFoundException fe){
				fe.printStackTrace();
			}catch(IOException ioe)
			{
				ioe.printStackTrace();
				
			}
			
			try{
				k=i/j;
				
			}catch(ArithmeticException ae){
				
				ae.printStackTrace();
			}
			
			finally{
				k=1;
			}
			return this;
		
	}
}
