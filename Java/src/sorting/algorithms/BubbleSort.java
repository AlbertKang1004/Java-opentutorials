package sorting.algorithms;

public class BubbleSort {

	public static void Bubble_Sort(int[] array) {
		for (int n = 0; n < array.length - 1; n++)
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}

			}
		for (int e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] Numbers = { 1, 5, 7, 3, 8, 2, 9, 4, 6, 0 };
		Bubble_Sort(Numbers);
	}

}
