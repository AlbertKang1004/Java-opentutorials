package canadian.computer.competition;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1_2020 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// STEP 1: Make a scanner and an array to store values
		int row = scanner.nextInt();
		int[][] timenposition = new int[row][2];

		// STEP 2: Get position/time values from user
		for (int i = 0; i < timenposition.length; i++) {
			for (int j = 0; j < timenposition[0].length; j++) {
				timenposition[i][j] = scanner.nextInt();
			}
		}

		// STEP 3: Sort Array by its time
		Arrays.sort(timenposition, (a, b) -> Double.compare(a[0], b[0]));

		// STEP 4: Initialize two arrays, time and position, to separate two values
		int[] time = new int[timenposition.length];
		for (int i = 0; i < time.length; i++) {
			time[i] = timenposition[i][0];
		}

		int[] position = new int[timenposition.length];
		for (int i = 0; i < position.length; i++) {
			position[i] = timenposition[i][1];
		}

		// STEP 5: Create 2 arrays that store difference of time/position
		int[] timeDiff = new int[time.length - 1];
		for (int i = 0; i < timeDiff.length; i++) {
			timeDiff[i] = Math.abs(time[i + 1] - time[i]);
		}

		int[] positionDiff = new int[time.length - 1];
		for (int i = 0; i < positionDiff.length; i++) {
			positionDiff[i] = Math.abs(position[i + 1] - position[i]);
		}

		// STEP 6: Create an array that contains the speed
		double speed[] = new double[timeDiff.length];
		for (int i = 0; i < speed.length; i++) {
			Double time_d = Double.valueOf(timeDiff[i]);
			Double position_d = Double.valueOf(positionDiff[i]);

			speed[i] = (position_d / time_d);
		}

		// STEP 7: Get the highest value
		double max = 0.0;
		for (int i = 0; i < speed.length; i++) {
			if (speed[i] > max) {
				max = speed[i];
			}
		}
		
		// STEP 8: Print the result
		System.out.println(max);

	}

}
