package org.opentutorials.javatutorials.inheritance.example3;

class Calculator {
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(left + right);

	}

	public void avg() {
		System.out.println((left + right) / 2);
	}

}

class SubCalculator extends Calculator {
	public SubCalculator(int left, int right) {
		super(left, right);
	}
	
	public void sub() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubCalculator c = new SubCalculator(10, 20);
		c.sum();
		c.avg();

	}

}
