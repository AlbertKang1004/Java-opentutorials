package org.opentutorials.javatutorials.enumerator;

enum Fruit2 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String Color;
	Fruit2(String Color) {
		System.out.println("Call Constructor " + this);
		this.Color = Color;
	}
	String getColor() {
		return this.Color;
	}
}

enum Company2 {
	GOOGLE, APPLE, ORACLE
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		Fruit2 type = Fruit2.APPLE;
		switch (type) {
		case APPLE:
			System.out.println(57 + " kcal | color " + Fruit2.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34 + " kcal | color " + Fruit2.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93 + " kcal | color " + Fruit2.BANANA.getColor());
			break;
		}
		
		for(Fruit2 f : Fruit2.values()) {
			System.out.println(f);
		}

	}

}
