package org.opentutorials.javatutorials.exception.example1;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		try {
			System.out.print("Result: ");
			System.out.println(this.left / this.right);
		} catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n " + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0); // x cannot be divided by 0
		c1.divide();
		
		Calculator c2 = new Calculator();
		c2.setOprands(10, 5);
		c2.divide();

	}

}
