package org.opentutorials.javatutorials.abstractclass;

abstract class A {
	public abstract int b();

//	public abstract int c() {
//		System.out.println("Hello");
//	}

	public void d() {
		System.out.println("World");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
