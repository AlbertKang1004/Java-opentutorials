package org.opentutorials.javatutorials.collection;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class ListSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2); // Only one 2 allowed!
		A.add(2); // Only one 2 allowed!
		A.add(3);
		
		Iterator<Integer> A_i = A.iterator(); 
		while (A_i.hasNext()) {
			System.out.print(A_i.next() + " ");
		}
		System.out.println();
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(2);
		B.add(2); 
		B.add(2); 
		B.add(3);
		
		Iterator<Integer> B_i = B.iterator();
		while (B_i.hasNext()) {
			System.out.print(B_i.next() + " ");
		}
	}

}
