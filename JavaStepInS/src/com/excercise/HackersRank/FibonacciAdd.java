package com.excercise.HackersRank;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine().trim());

		scan.close();

		long[] fibNo = new long[n];

		for(int i=0;i<n;i++)
		{
			if(i<2){
				fibNo[i] = i;
			}
			else{
				fibNo[i] = fibNo[i-1]+fibNo[i-2];
			}
		}

		System.out.println("fibNo: "+Arrays.toString(fibNo));

	}

}
