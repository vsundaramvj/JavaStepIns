package com.excercise.HackersRank;

import java.util.Scanner;

public class SolutionArrReverse {
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		scanner.close();
		printArrReverse(arr, n);
		
	}
	
	public static void printArrReverse(int[] arr, int n)
	{
		int length = arr.length;
		int[] arrReverse = new int[n];
		for(int i=0;i<arr.length;i++, length--)
		{
			if(arr[length-1]>=1 && arr[length-1]<=10000)
			{
				arrReverse[i] = arr[length-1];
			}
		}
		
		
		for(int j:arrReverse){
			System.out.print(j);
			System.out.print(" ");
			
		}

	}

}
