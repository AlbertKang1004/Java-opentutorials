package my.project;

public class ArrayPrintUsingGenerics {

	public static <T> void printArray(T array[]) {
		for (T e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] int_array = {2, 6, 2, 7, 8, 23, 6};
		Character[] char_array = {'s', 'o', 'm', 'e'};
		String[] string_array = {"hi", "my", "name", "is", "arstneio"};
		
		printArray(int_array);
		printArray(char_array);
		printArray(string_array);
	}

}
