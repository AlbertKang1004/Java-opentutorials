package org.opentutorials.javatutorials.exception.example2;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
//		if (right == 0) {
//			throw new IllegalArgumentException("Divisor cannot be equal to zero");
//		}
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if (right == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		try {
			System.out.print("Result is ");
			System.out.print(this.left/this.right);
			System.out.println(".");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\ne.toString()\n" + e.toString());
			System.out.println("\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
