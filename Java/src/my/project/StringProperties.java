package my.project;

public class StringProperties {

	public static void main(String[] args) {

		String string = new String("Hello World!");
		String string2 = new String("HELLO WORLD!");
		// Initialize a new String.

		System.out.println(string);

		System.out.println(string.charAt(2));
		// Returns the char value at the specified index.
		// OUTPUT: l (3rd character)

		System.out.println(string.codePointAt(2));
		// Returns the character (Unicode code point) at the specified index.
		// OUTPUT: 108 (l's unicode value)

		System.out.println(string.codePointBefore(2));
		// Returns the character (Unicode code point) before the specified index.
		// OUTPUT: 101 (e's unicode value)

		System.out.println(string.codePointCount(0, 3));
		// Returns the number of Unicode code points in the specified text range of this
		// String.
		// OUTPUT: 3 (H, e, l)

		System.out.println(string.compareTo(string2));
		// Compares two strings lexicographically.
		// OUTPUT: 32 (false)

		System.out.println(string.compareToIgnoreCase(string2));
		// Compares two strings lexicographically, ignoring case differences.
		// OUTPUT: 0 (true)

		System.out.println(string.concat("YAY"));
		// Concatenates the specified string to the end of this string.
		// OUTPUT: Hello World!YAY

		System.out.println(string.endsWith("!"));
		// Tests if this string ends with the specified suffix.
		// OUTPUT: true

		System.out.println(string.equals(string2));
		// Compares this string to the specified object.
		// OUTPUT: false ("Hello World!" != "HELLO WORLD!")

		System.out.println(string.equalsIgnoreCase(string2));
		// OUTPUT: true ("HELLO WORLD!" == "HELLO WORLD!") - ignoring cases

		byte[] string_b = new byte[string.length()];
		string_b = string.getBytes();

		for (int i = 0; i < string_b.length; i++) {
			System.out.print(string_b[i] + "|");
		}
		// Encodes this String into a sequence of bytes using the platform's default
		// charset, storing the result into a new byte array.
		// OUTPUT: 72/101/108/108/111/32/87/111/114/108/100/33
		System.out.println();

		char[] string_c = new char[4];
		string.getChars(0, 4, string_c, 0);
		for (int i = 0; i < string_c.length; i++) {
			System.out.print(string_c[i] + "|");
		}
		// Copies characters from this string into the destination character array.
		// OUTPUT: H/e/l/l

		System.out.println();

		System.out.println(string.indexOf("Hel"));
		// Returns the index within this string of the first occurrence of the specified
		// substring.
		// OUTPUT: 0 (true)
		// "Hel"lo World! -> "Hel" found

		System.out.println(string.indexOf("Hel", 1));
		// Returns the index within this string of the first occurrence of the specified
		// substring, starting at the specified index.
		// OUTPUT: -1 (false)
		// ello World! -> "Hel" not found

		System.out.println(string.isEmpty());
		// Returns true if, and only if, length() is 0.
		// OUTPUT: false (string.length != 0)

		System.out.println(string.lastIndexOf("l"));
		// Returns the index within this string of the last occurrence of the specified
		// substring.
		// OUTPUT: 9
		// Hello wor"l"d! -> 10th character

		System.out.println(string.lastIndexOf("l", 3));
		// Returns the index within this string of the last occurrence of the specified
		// substring, searching backward starting at the specified index.
		// OUTPUT: 3
		// Hel"l"o wor -> 4th character

		System.out.println(string.length());
		// Returns the length of this string.
		// OUTPUT: 12

		System.out.println(string.replace('l', 'm'));
		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		// OUTPUT: Hemmo wormd!

		System.out.println(string.replaceAll("Hello", "Bye"));
		// Replaces each substring of this string that matches the given regular
		// expression with the given replacement.
		// OUTPUT: Bye World!

		String[] string_s = new String[string.split("o").length];
		string_s = string.split("o");
		for (int i = 0; i < string_s.length; i++) {
			System.out.print(string_s[i] + "|");
		}
		// Splits this string around matches of the given regular expression.
		// OUTPUT: Hell/ w/rld!
		System.out.println();

		System.out.println(string.startsWith("He"));
		// Tests if this string starts with the specified prefix.
		// OUTPUT: true

		System.out.println(string.substring(2));
		// Returns a string that is a substring of this string.
		// OUTPUT: llo World! (He)

		System.out.println(string.substring(3, 7));
		// Returns a string that is a substring of this string.
		// OUTPUT: llo W (He, orld!)

		char[] string_c2 = new char[string.length()];
		string_c2 = string.toCharArray();
		for (int i = 0; i < string_c2.length; i++) {
			System.out.print(string_c2[i] + "|");
		}
		// Converts this string to a new character array.
		// OUTPUT: H/e/l/l/o/ /W/o/r/l/d/!
		// For additional settings, use getChar()
		System.out.println();

		System.out.println(string.toLowerCase());
		// Converts all of the characters in this String to lower case using the rules
		// of the default locale.
		// OUTPUT: hello world!

		System.out.println(string.toUpperCase());
		// Converts all of the characters in this String to upper case using the rules
		// of the default locale.
		// OUTPUT: HELLO WORLD!

		System.out.println(" H ".trim());
		// Returns a string whose value is this string, with any leading and trailing
		// whitespace removed.
		// OUTPUT: H

		boolean b = true;
		System.out.println(String.valueOf(b));
		// Returns the string representation of the boolean argument.
		// OUTPUT: true

		char c = 'e';
		System.out.println(String.valueOf(c));
		// Returns the string representation of the char argument.
		// OUTPUT: e

		System.out.println(String.valueOf(string_c2));
		// Returns the string representation of the char array argument.
		// OUTPUT: Hello World!

		System.out.println(String.valueOf(string_c2, 2, 5));
		// Returns the string representation of a specific subarray of the char array
		// argument.
		// OUTPUT: llo W

		double d = 3.141592;
		System.out.println(String.valueOf(d));
		// Returns the string representation of the double argument.
		// OUTPUT: 3.141592

		float f = 6.001f;
		System.out.println(String.valueOf(f));
		// Returns the string representation of the float argument.
		// OUTPUT: 6.001

		int i = 1234;
		System.out.println(String.valueOf(i));
		// Returns the string representation of the int argument.
		// OUTPUT: 1234

		long l = 4385723;
		System.out.println(String.valueOf(l));
		// Returns the string representation of the long argument.
		// OUTPUT: 4385723
	}

}
