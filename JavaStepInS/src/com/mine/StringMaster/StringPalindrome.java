package com.mine.StringMaster;


import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[]) {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		scan.close();
		String reversedString="";
		for(int i=0;i<inputString.length();i++)
		{
			
			char c = inputString.charAt(i);
			reversedString = Character.toString(c).concat(reversedString);
		}
		
		if(inputString.equals(reversedString)) System.out.println("Palindrome..");
		else System.out.println("not palindrome..");
		
		boolean fooIs = palaindromeEfficient(inputString);
		if(fooIs==true)
			System.out.println("Palindrome efficient");
			else System.out.println("Not Plaindrome efficient");
		
	}
	
	public static boolean palaindromeEfficient(String inputString)
	{
		boolean foo = false;
		int length = inputString.length();

		for(int firstIndex=0, lastIndex=length-1;firstIndex<=lastIndex;firstIndex++,lastIndex--)
		{
			if(inputString.charAt(firstIndex)==inputString.charAt(lastIndex)) foo = true;
			else 
				{foo=false; break;}
		}
		return foo;
	}
}
