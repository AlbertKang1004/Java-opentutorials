package org.opentutorials.javatutorials.inheritance.example1;

class DivCalculator extends MulCalculator {
	public void div() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		DivCalculator c = new DivCalculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		c.mul();
		c.div();

	}

}
