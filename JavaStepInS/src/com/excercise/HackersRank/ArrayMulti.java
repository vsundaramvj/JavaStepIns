package com.excercise.HackersRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
		Scanner scan = new Scanner(System.in);
		
		List<ArrayList> masterArrayList = new ArrayList<>();
		
		int noOfInputs = Integer.parseInt(scan.nextLine().trim());
		
		for(int i =0; i<noOfInputs;i++)
		{
			ArrayList<Integer> arrayList = new ArrayList();
			String[] arrayListInput = scan.nextLine().split(" ");
		
			for(int spilts=0;spilts<arrayListInput.length;spilts++)
			{
				int arrayValue = Integer.parseInt(arrayListInput[spilts]);
				arrayList.add(spilts, arrayValue);
			}
			
			masterArrayList.add(arrayList);
		}
		
	
	// Output Part:
	
	int noOfOutputs = Integer.parseInt(scan.nextLine().trim());
	
	int index = 0;
	int value = 0;
	List<Object> masterOutArList = new ArrayList<>();
	for(int i=0;i<noOfOutputs;i++)
	{
		String[] getIndexVal = scan.nextLine().split(" ");
		index = Integer.parseInt(getIndexVal[0]);
		value = Integer.parseInt(getIndexVal[1]);
		masterOutArList.add(getPrint(index, value, masterArrayList));
	}
	scan.close();
	Iterator i = masterOutArList.iterator();
    while(i.hasNext())
    {
System.out.println(i.next());
    }
	}
	
	public static Object getPrint(int index, int value, List<ArrayList> masterArrayList){
		Object positionValue = "ERROR!";
		
			
			if(masterArrayList.size()>=index-1)
			{
				ArrayList<Integer> arrayList = new ArrayList<>();
						
				arrayList = masterArrayList.get(index-1);
				if(arrayList.size()>value)
				{
					positionValue = arrayList.get(value);
				}
				else
				{
					positionValue = "ERROR!";
				}
			}
			else{
				positionValue = "ERROR!";
			}
				
				
				
		
		return positionValue;
	}
}
