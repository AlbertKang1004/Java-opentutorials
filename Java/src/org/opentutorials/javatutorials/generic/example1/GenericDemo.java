package org.opentutorials.javatutorials.generic.example1;

class Person<T> {
	public T info;
}

public class GenericDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person<String> p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();

	}

}
