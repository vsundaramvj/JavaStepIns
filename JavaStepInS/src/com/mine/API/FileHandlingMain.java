package com.mine.API;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

// FileInputReader: Byte Reader

public class FileHandlingMain {

	static Properties propertyFile = new Properties();
	static InputStream loadPropStream = null;
	public static void main(String[] args) throws IOException{

		// load from property:
		
		loadPropStream = new FileInputStream("FileNames.properties");
		propertyFile.load(loadPropStream);
		String inputFilePath = propertyFile.getProperty("InputFilePath");

		// read from file:
		
		File reader = new File(inputFilePath);
		
		Scanner scan = new Scanner(reader);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		scan.close();

		// write to file:
		
		File writer = new File(propertyFile.getProperty("OutputFilePath"));
		byte[] buffer = {'A','G'};
		FileOutputStream writeStream = new FileOutputStream(writer);
		writeStream.write(buffer);
		writeStream.close();
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
