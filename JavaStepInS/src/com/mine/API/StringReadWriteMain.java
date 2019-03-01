package com.mine.API;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReadWriteMain {

	public static void main(String[] args) throws IOException{

		StringReader str = new StringReader("InputFile.txt");

		int i =0;
		while((i=str.read())!=-1)
		{
			System.out.println((char)i);
		}

		str.close();

		StringWriter stw = new StringWriter();
		stw.write("File is writing");

		System.out.println(stw.toString());
		File writeTo = new File("writeTo.txt");

		FileWriter ftw = new FileWriter(writeTo);
		BufferedWriter btw = new BufferedWriter(ftw);
		btw.flush();
		btw.write(stw.toString());
		btw.close();
		ftw.close();
	}

}
