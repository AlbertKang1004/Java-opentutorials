package org.opentutorials.javatutorials.generic.example3;

interface Info {
	int getLevel();
}

class EmployeeInfo implements Info {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}
class Person<T extends Info> {
	public T info;
	Person(T info) {
		this.info = info;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		// Person<String> p2 = new Person<String>("Negative");
		System.out.println(p1.info.rank);
	}

}
