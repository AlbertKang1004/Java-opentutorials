package canadian.computer.contest.tips.and.tricks;

import java.util.Arrays;

public class ArrayManipulation {

	public static int[] ArrayFlip(int[] array) {
		// Flips the array
		for (int i = 0; i < (array.length / 2); i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;

	}

	public static boolean FindIfSameValue(int[] array) {

		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1])
				return true;
		}
		return false;
	}

	public static int GetSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(ArrayFlip(array)));

		int[] array2 = { 1, 6, 3, 7, 2, 5, 5 };
		System.out.println(FindIfSameValue(array2));
		
		int[] array3 = { 3, 6, 2, 6, 7, 1, 9 };
		System.out.println(GetSum(array3));
	}

}
