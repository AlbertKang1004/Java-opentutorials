package org.opentutorials.javatutorials.classandinstance;

class Calculator {
	final static double PI = 3.14159265;
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);

	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {

		System.out.println(Calculator.PI);

	}

}
