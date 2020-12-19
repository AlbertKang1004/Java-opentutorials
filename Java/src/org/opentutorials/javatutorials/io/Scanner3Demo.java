package org.opentutorials.javatutorials.io;

import java.io.*;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {

		try {
			File file = new File("out.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextInt()) {
				System.out.println(scanner.nextInt() * 1000);

			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}