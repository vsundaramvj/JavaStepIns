package com.mine.Exceptions;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleException me = new MultipleException();
		me.multiExpSample(90, 9);
		System.out.println("me: k: "+me.k);
		
		// when no exception handler, JVM throws default exception and terminates the program:
		NoException noe = new NoException();
		noe.noExpSample(0, 0);
		System.out.println("noe.k: "+noe.k);
		
		
		NestedException ne = new NestedException();
		ne.nestedExpSample(1, 5);
		System.out.println("ne: k: "+ne.k);
		
	}

}
