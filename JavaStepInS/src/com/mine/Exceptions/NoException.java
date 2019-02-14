package com.mine.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class NoException {

	int k;

	public NoException noExpSample(int i, int j)
	{
		
		String st;
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
		return this;
	}
}
