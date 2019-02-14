package com.mine.CollectionBegin.ListsImpl;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> stack = new Stack<>();
		
		stack.add(55);
		stack.add(56);
		stack.add(60);
		stack.add(57);
		stack.add(58);
		stack.add(59);
		Iterator<Integer> i = stack.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Collections.sort(stack);
		
		//stack.forEach(System.out :: println);
		System.out.println(stack.toString());
		
	}

}
