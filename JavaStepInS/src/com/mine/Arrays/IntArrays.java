package com.mine.Arrays;

import java.util.Arrays;

public class IntArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. int Array: 
		
		int Array1D[] = {1,5,3,6,47,9};
		
		Arrays.sort(Array1D,0,Array1D.length);
		System.out.println("Sorted: "+Arrays.toString(Array1D));
		
		int Array2D[][] = {
				{2,2,2,2,1}, {55,66,99,11}, {45,56,78,89,12}	
		};
		
		
		int Array3D[][][] = {
				{
					{1,2,3,4}, {5,6,7,8}
				},
				{
					{11,22,33,44}, {55,66,77,88}
				}
		};
		
		for(int i:Array1D)
		{
			System.out.println("Array1D: "+i);
		}
		
		for(int[] i: Array2D)
		{
			for(int j: i)
			{
				System.out.println("i: "+i.hashCode()+" j: "+j);
			}
			
		}
		
		for(int[][] i:Array3D)
		{
			for(int[] j: i)
			{
				for(int k: j)
				{
					System.out.println("i: "+i.hashCode()+" j: "+j.hashCode()+" k: "+k);
				}
			}
		}
	}

}
