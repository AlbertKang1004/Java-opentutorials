package org.opentutorials.javatutorials.polymorphism.example1;

interface I {
}

class E implements I {
}

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		I obj = new E();

	}

}
