package com.mine.API;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamMain {

	public static void main(String[] args) throws IOException {

		FileReader freader = new FileReader(new File("InputFile.txt"));
		BufferedReader breader = new BufferedReader(freader);
		String currentLine = "";
		while(( currentLine= breader.readLine())!=null)
		{
			System.out.println(currentLine);
		}

		breader.close();
	}

}
