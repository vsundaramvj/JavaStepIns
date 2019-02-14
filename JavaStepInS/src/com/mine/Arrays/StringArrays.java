package com.mine.Arrays;

import java.util.Arrays;

public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Array1D = {"THIS IS A NEW ARRAY", "AND THE SECOND VALUE"};

		System.out.println("Arrays: "+Arrays.toString(Array1D));
		
		String[][] Array2D = {
				{"THIS IS A NEW ARRAY 1 ", "AND THE SECOND VALUE 1 "},
				{"THIS IS A NEW ARRAY 2", "AND THE SECOND VALUE 2 "},
				{"THIS IS A NEW ARRAY 3 ", "AND THE SECOND VALUE 3 "},
				{"THIS IS A NEW ARRAY 4", "AND THE SECOND VALUE 4"},
		};

		for(String i: Array1D)
		{
			System.out.println("i: "+i);
		}
		
		for(String[] i: Array2D)
		{
			for(String j: i)
			{
				System.out.println("i:"+i.hashCode()+" j: "+j);
			}
		}
	}

}
