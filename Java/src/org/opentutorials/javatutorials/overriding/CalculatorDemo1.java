package org.opentutorials.javatutorials.overriding;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		return (this.left - this.right) / 2;
	}
}

class SubCalculator extends Calculator {
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
	}

	public void sub() {
		System.out.println(this.left - this.right);
	}

	public int avg() {
		return super.avg();
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubCalculator c = new SubCalculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		c.sub();
	}

}
