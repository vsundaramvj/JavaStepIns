package com.mine.CollectionBegin;

/////////////////////////////////////////////////////////////////////////////////////////
/* Interfaces */
// Iterable --> iterator() --> 	Iterator
// Collection 
// List Set Queue 	// Set <-- SortedSet <-- NavigableSet	// Queue <-- Deque

/* Classes */
// List <-- ArrayList, LinkedList, Stack, Vector
// Set <-- HashSet, LinkedHashSet, TreeSet
// Queue <-- PriorityQueue, ArrayDeque, LinkedList										


/////////////////////////////////////////////////////////////////////////////////////////
/* Interfaces */
// Map <-- SortedMap <-- NavigableMap
/* Classes */
// Map <-- HashMap, Hashtable, LinkedHashMap, TreeMap


/////////////////////////////////////////////////////////////////////////////////////////



import java.util.HashMap;
import java.util.Map;

// simple comparable and comparator difference:


public class CollectionBegins {
	
	public static void main(String args[])
	{
		Map<String, String> map = new HashMap<>();
		
		map.put("Name","Steve walk");
		map.put("Song","Sing in the rain");
		map.put("Native","Canada");
		
		System.out.println(map);
		
}
}
