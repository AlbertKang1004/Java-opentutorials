package project.samePackage;

public class Same {

	public void _public() {
		System.out.println("public");
	}

	protected void _protected() {
		System.out.println("protected");
	}

	void _default() {
		System.out.println("default");
	}

	@SuppressWarnings("unused")
	private void _private() {
		System.out.println("private");
	}

}
