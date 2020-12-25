package org.opentutorials.javatutorials.polymorphism;

class C {
	public String x() {
		return "x";
	}
}

class D extends C {
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		C obj = new D();
		obj.x();
//		obj.y();

	}

}
