package org.opentutorials.javatutorials.classandinstance;

class C1 {
	static int static_var = 1;
	int instance_var = 2;

	static void static_static() {
		System.out.println(static_var);
	}

	static void static_instance() {
		//System.out.println(instance_var);		FAIL
	}

	void instance_static() {
		System.out.println(static_var);
	}

	void instance_instance() {
		System.out.println(instance_var);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		C1 c = new C1();
		//c.static_static();			NOT RECOMMENDED
		//c.static_instance();		FAIL
		c.instance_static();
		c.instance_instance();

		C1.static_static();
		//C1.static_instance();		FAIL
		//C1.instance_static();		FAIL
		//C1.instance_instance();	FAIL
	}

}
