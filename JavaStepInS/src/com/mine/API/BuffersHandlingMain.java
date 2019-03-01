package com.mine.API;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffersHandlingMain {

	public static void main(String[] args) throws IOException{

		// load from property:


		// read from file:

		FileInputStream reader = new FileInputStream("InputFile.txt");

		BufferedInputStream bufferedRead = new BufferedInputStream(reader);

		FileOutputStream writer = new FileOutputStream("OutputFile.txt");
		BufferedOutputStream bufferedWrite = new BufferedOutputStream(writer);

		int i =0;
		while((i =bufferedRead.read()) != -1)
		{
			bufferedWrite.write((char)i);
		}
		byte[] addforoutput = {'\n', 'O','U','T','P','U','T','.'};

		bufferedWrite.write(addforoutput);

		bufferedRead.close();
		bufferedWrite.close();
		// write to file:

		// to read a list of files in a specific path:
		/*
		File file = new File(".");
		for(String fileNames : file.list()) {
			System.out.println(fileNames);
			if(fileNames.equalsIgnoreCase("inputfile.txt"))
			{
				System.out.println("successsssssssssss");
			}
		}*/

	}

}