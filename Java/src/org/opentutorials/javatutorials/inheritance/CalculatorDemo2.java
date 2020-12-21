package org.opentutorials.javatutorials.inheritance;

class MulCalculator extends Calculator {
	public void mul() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {

		MulCalculator c = new MulCalculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		c.mul();
	}

}
