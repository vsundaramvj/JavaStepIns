package com.excercise.HackersRank;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int noOfLines = Integer.parseInt(scan.nextLine());
		String[] inputStringArr = new String[10];
		if (noOfLines >= 1 && noOfLines <= 10) {
			int i = 0;
			do
			{
				inputStringArr[i] = scan.nextLine();
				i++;
			}while(i<noOfLines);
			scan.close();
			
			printOddEven(noOfLines,inputStringArr);
		}

	}
	
	public static void printOddEven(int noOfLines, String[] inputStringArr){
		
		for (int j = 0; j < noOfLines; j++) {

			int strLength = inputStringArr[j].length();
			if(strLength>=2&&strLength<=10000){
				StringBuffer evenString = new StringBuffer();
				StringBuffer oddString = new StringBuffer();
				// String level:
				for (int k = 0; k < strLength; k++) {

					if (k % 2 == 0) {
						evenString.append(inputStringArr[j].charAt(k));
					} else {
						oddString.append(inputStringArr[j].charAt(k));
					}

				}
				System.out.println(evenString + " " + oddString);
			}
		}
	}
}