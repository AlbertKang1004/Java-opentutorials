package org.opentutorials.javatutorials.exception.example3;

@SuppressWarnings("serial")
class DivideException extends ArithmeticException {
	public int left; 
	public int right;
	
	DivideException() {
		super();
	}

	DivideException(String message, int left, int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (this.right == 0) {
			throw new DivideException("You cannot divide a number by zero.", this.left, this.right);
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
