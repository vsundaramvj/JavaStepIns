package com.mine.CollectionBegin.ListsImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(15);
		list.add(25);
		list.add(null);
		list.add(35);
		list.add(null);
		list.add(45);
		list.add(null);
		list.add(55);
		list.add(45);
		list.add(null);
		
		list.forEach(System.out :: println);
		
		
		System.out.println("-------------------------------------");

		System.out.println("list: "+list.toString());

		System.out.println("-------------------------------------");

		for(int i=0;i<list.size();i++)
		{
			System.out.println("list for: "+i+" value: "+list.get(i));
		}

		System.out.println("-------------------------------------");

		for(Integer i: list)
		{
			System.out.println("list for each: "+i);
		}

		Iterator<Integer> i = list.iterator();

		System.out.println("-------------------------------------");
		while(i.hasNext())
		{
			System.out.println("list while: "+i.next());
		}
		System.out.println("-------------------------------------");

	}

}
