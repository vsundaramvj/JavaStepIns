package com.excercise.HackersRank;

import java.util.Scanner;

public class Hourglass2D {


	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scanner.nextLine().trim()) ;
		int	[][]arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		scanner.close();
		int maxSum =0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=0;j<n-2;j++)
			{
				int total = (arr[i][j]) + (arr[i][j+1]) + (arr[i][j+2])
						+ (arr[i+1][j+1])
						+ (arr[i+2][j]) + (arr[i+2][j+1]) + (arr[i+2][j+2]);

				if(maxSum<total)
				{
					maxSum = total;
				}
			}

		}

		System.out.println(maxSum);
	}
}
