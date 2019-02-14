package com.mine.KeywordsConcepts;

strictfp class ImplStrictFP1 {

	public float checkSum(float area)
	{
		float areas = area*area;
		System.out.println("areas in checkSum: : "+areas);
		return areas;
	}
}


class ImplStrictFP2{

	public static void main(String[] ar)
	{

		ImplStrictFP1 sfp = new ImplStrictFP1();

		float areas = sfp.checkSum(1234.56f);

		System.out.println("areas:: "+areas);
	}
}



public class ImplStrictFP 
	{ 
	    // calculating sum using strictfp modifier 
	    public strictfp double sum() 
	    { 
	        double num1 = 10e+10; 
	  
	        double num2 = 6e+08; 
	  
	        return (num1+num2); 
	  
	    } 
	  
	    public static strictfp void main(String[] args) 
	    { 
	    	ImplStrictFP t = new ImplStrictFP(); 
	  
	        System.out.println(t.sum()); 
	        
	        String[] ar = {"new","world"};
	        ImplStrictFP2.main(ar);
	    } 
	} 