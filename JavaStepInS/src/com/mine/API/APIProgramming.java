package com.mine.API;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class APIProgramming {

	public static void newMain() throws IOException{
		File outputFile = new File("written.txt");
		OutputStream output = new FileOutputStream(outputFile);
		byte[] b = {'H','E','L','L','O'};
		
		output.write(b);
	}
	public static void main(String[] args) throws IOException
	{
		newMain();
	}
}
