package com.excercise.HackersRank;


import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[] elements)
    {
        this.elements = elements;
    }
    
    public void computeDifference(){
    	
    	//List<Integer> differenceList = Arrays.stream(elements).boxed().collect(Collectors.toList());
    	List<Integer> differenceList = new ArrayList<>();
    	for(int i : elements)
    	{
    		differenceList.add(i);
    	}
    	int maxValue = Collections.max(differenceList);
    	int minValue = Collections.min(differenceList);
    	maximumDifference = maxValue - minValue;
    	
    }
	// Add your code here

} // End of Difference class

public class Solution14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}