package org.opentutorials.javatutorials.collection;

import java.util.*;

public class MapDemo {
	
	static void iteratorUsingForEach(Map<String, Integer> a) {
		Set<Map.Entry<String, Integer>> entries = a.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(Map<String, Integer> a) {
		Set<Map.Entry<String, Integer>> entries = a.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		System.out.println(a.get("four"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
}
