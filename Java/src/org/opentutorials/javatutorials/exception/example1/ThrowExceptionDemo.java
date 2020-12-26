package org.opentutorials.javatutorials.exception.example1;

import java.io.*;

class C {
	@SuppressWarnings("resource")
	void run() throws IOException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt."));
		input = bReader.readLine();
		System.out.println(input);
	}
}

class D {
	void run () throws IOException {
		C c = new C();
		c.run();
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		D d = new D();
		try {
			d.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt not found in normal directory");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
