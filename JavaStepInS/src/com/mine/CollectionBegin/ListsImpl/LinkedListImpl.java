package com.mine.CollectionBegin.ListsImpl;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(78);
		linkedList.add(85);
		linkedList.add(99);
		linkedList.add(65);
		linkedList.add(88);
		
		System.out.println("Linkedlist : "+linkedList.toString());

		linkedList.add(3, 456);
		linkedList.forEach(System.out :: println);
		
		System.out.println(linkedList.contains(109));;
		
		
		
	}

}
