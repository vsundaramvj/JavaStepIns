package com.excercise.HackersRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListImple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine().trim());
		
		// to split issue:
		
		String inputs[] = scan.nextLine().split(" ");
		
		List<Integer> inQueue = new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			inQueue.add(Integer.parseInt(inputs[i]));
		}
	//	System.out.println("inqueue: "+inQueue);
		
		int noOfQueuries = Integer.parseInt(scan.nextLine().trim());
		int index =0;
		int value =0;
		for(int j=0;j<noOfQueuries;j++)
		{
			String operation = scan.nextLine().trim();
			if(operation.equalsIgnoreCase("insert"))
			{
				// insert logic
				String indexValues[] = scan.nextLine().split(" ");
				index = Integer.parseInt(indexValues[0]);
				value = Integer.parseInt(indexValues[1]);
				inQueue = insertLogic(inQueue, index, value);
			}
			else
			{
				// delete logic
				index = Integer.parseInt(scan.nextLine().trim());
				inQueue = deleteLogic(inQueue, index);
			}
		}
		
		  // String print = justForPrint(inQueue);
        
	       // System.out.println(print);

	      // System.out.println(inQueue);
	       Iterator i = inQueue.iterator();
	       while(i.hasNext())
	       {
	    	   System.out.print(i.next()+" ");
	       }
		
	}
	
	public static List<Integer> insertLogic(List<Integer> insertQueue, int index, int value){
		insertQueue.add(index, value);
		return insertQueue;
	}
	
	public static List<Integer> deleteLogic(List<Integer> insertQueue, int index){
		insertQueue.remove(index);
		return insertQueue;
	}
	
	public static String justForPrint(List<Integer> insertQueue){
		
		String printString = "[";
		
		Iterator i = insertQueue.iterator();


		for(int count=0;count<insertQueue.size()-1;count++)
		{
			
			printString = printString+i.next()+", ";
		}
		
		printString = printString+i.next();
		printString = printString+"]";
		return printString;
		
	}
}
