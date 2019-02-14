package com.mine.Arrays;

import java.util.Arrays;

public class ArraysClassConfirmer {
	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,8};
		int[] b = new int[a.length+1];
		
		// System arraycopy:
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("b: "+Arrays.toString(b));
		
		// Arrays copyRangeOf:
		
		int[] c = Arrays.copyOfRange(a, 3, a.length);
		System.out.println("c: "+Arrays.toString(c));
		
		
		
		// array equals:
		
		boolean confirm = Arrays.equals(a, b);
		System.out.println("confirm: "+confirm);
		
		// array sorting: 
		
		int[] unsorted = {88,4,2,47854,556,34,-56,66,-78756};
		
		Arrays.sort(unsorted);
		
		System.out.println("unsorted: "+Arrays.toString(unsorted));
		
		// 2D arrays with copying:
		
		int[][] a2D = {
				{22,33,44},
				{55,66,77}
		};
		
		System.out.println("a2D: "+Arrays.toString(a2D));
		System.out.println("deepToString: a2D: "+Arrays.deepToString(a2D));
		
		int[][] b2D = new int[a2D.length][];
		
		for(int i=0;i<a2D.length;i++)
		{
			b2D[i] = new int[a2D[i].length];
			System.arraycopy(a2D[i], 0, b2D[i], 0, a2D[i].length);
			
			/*for(int j=0;j<a2D[i].length;j++)
			{
				b2D[i][j] = a2D[i][j];
			}*/
			
		}
		
		System.out.println("deepToString: b2D: "+Arrays.deepToString(b2D));
			
	}
}
