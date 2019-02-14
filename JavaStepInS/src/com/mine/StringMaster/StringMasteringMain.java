package com.mine.StringMaster;


public class StringMasteringMain {

	public static void main(String[] args) {
		
		// 1) String constructors:
		
		/* Test Case 1: String is immutable: */
		
		String string1 = new String("newString");

		System.out.println("string1 newString: "+string1.hashCode());
		
		byte[] b = {1,0,1,1,0,0};
		String string2 = new String(b);
		string1 = string2;

		System.out.println("string2 bytes: "+string2.hashCode());
		System.out.println("string1 bytes: "+string1.hashCode());
		string1 = "newval";
		System.out.println("string2 bytes: "+string2.hashCode());
		System.out.println("string1 newval: "+string1.hashCode());

		string1 = new String("newString");
		System.out.println("string1 newString: "+string1.hashCode());
		/*end of Test Case 1: String is immutable: */

		// String with Char array:
		char[] c = {'h','e','l','l','o',' ', '!'};
		String string3 = new String(c);

		System.out.println("string3 char: "+string3);
		
		// String with String:
		String str = "hi";
		String string4 = new String(str);
				
		System.out.println("string4 String: "+string4);
		
		//memory taking:
		
		String string5 = "a";
		System.out.println("string5: "+string5);
		for(int i=0;i<100;i++)
		{
			string5 = string5+"a";
		}
		System.out.println("string5: "+string5);

	}

}
