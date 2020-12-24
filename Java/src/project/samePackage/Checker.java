package project.samePackage;

import project.differentPackage.*;

class SameClassChecker {
	public SameClassChecker() {
		// Same Class
		this._public();
		this._protected();
		this._default();
		this._private();

	}

	public void _public() {
		System.out.println("public");
	}

	protected void _protected() {
		System.out.println("protected");
	}

	void _default() {
		System.out.println("default");
	}

	private void _private() {
		System.out.println("private");
	}

}

class SamePackageChecker extends Same {
	public SamePackageChecker() {
		// Same Package
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
		// same._private(); 			    ERROR

		// Same Package, Subclasses
		this._public();
		this._protected();
		this._default();
		// this._private();				ERROR		
	}
}

class DifferentPackageChecker extends Different {
	public DifferentPackageChecker() {
		// Different Package
		Different different = new Different();
		different._public();
		// different._protected(); 		ERROR
		// different._default(); 		ERROR
		// different._private(); 		ERROR

		// Different Package, Subclasses
		this._public();
		this._protected();
		// this._default();				ERROR
		// this._private(); 				ERROR
		
		// Different Package
		None none = new None();
		none._public();
		// none._protected(); 			ERROR
		// none._default(); 				ERROR
		// none._private(); 				ERROR

	}
}

public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
