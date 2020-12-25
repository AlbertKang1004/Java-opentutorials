package org.opentutorials.javatutorials.finalexample;

class Calculator {
	static final double PI = Math.PI;
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		// Calculator.PI = 6; Cannot change the value
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Calculator c = new Calculator();
		// c.PI = 3; Cannot change the value
		System.out.println(Calculator.PI);

	}

}
