package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			System.out.println(scanner.nextInt() * 1000);
		}
		scanner.close();
	}

}
