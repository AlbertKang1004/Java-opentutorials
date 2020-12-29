package org.opentutorials.javatutorials.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		// A = {1, 2, 3}
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		// B = {3, 4, 5}
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		// C = {1, 2}
		
		System.out.println(A.containsAll(B)); // False
		// {3, 4, 5} ∉ {1, 2, 3}
		System.out.println(A.containsAll(C)); // True
		// {1, 2} ∈ {1, 2, 3}
		
//		 A.addAll(B); // {1, 2, 3} ∪ {3, 4, 5} --> {1, 2, 3, 4, 5}
//		 A.retainAll(B); // {1, 2, 3} ∩ {3, 4, 5} --> {3}
		 A.removeAll(B); // {1, 2, 3} - {3, 4, 5} --> {1, 2}
		
		 Iterator<Integer> A_i = A.iterator();
		 while(A_i.hasNext()) {
			 System.out.print(A_i.next() + " ");
		 }
	}

}
