package org.opentutorials.javatutorials.exception.example1;

class B {
	private int[] arr = new int[3];

	B() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		} catch (Exception e) {
			System.out.println("Exception e");
		} finally {
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		B b = new B();
		b.z(10, 1);
	}

}
