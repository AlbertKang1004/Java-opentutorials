package org.opentutorials.javatutorials.overloading.example1;

class Calculator {
	int left, right;
	int third = 0;

	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int right, int third) {
		this.setOprands(left, right);
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		Calculator c2 = new Calculator();
		c2.setOprands(10, 20, 30);
		c2.sum();
		c2.avg();
	}

}
