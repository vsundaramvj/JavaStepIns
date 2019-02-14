package com.excercise.HackersRank;

import java.util.*;

public class ToBinary {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        String binary = Integer.toString(n,2);
        System.out.println("binary: "+binary);
        int count=0;
        String[] consec1 = binary.split("0");
        System.out.println(Arrays.toString(consec1));

        consec1 = Arrays.stream(consec1)
        		.filter(e -> !e.equals("".trim())).toArray(String[]::new);
      //  System.out.println(Arrays.toString(consec1));
      //  System.out.println(consec1[0].length());
        count = consec1[0].length();
        for(int i=consec1.length-1;i>=0;i--)
        {
        	if(count<consec1[i].length())
        	{
        		count=consec1[i].length();
        	}
        }
        
        System.out.println(count);
        
    }
}
