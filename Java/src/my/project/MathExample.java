package my.project;

import java.util.Arrays;

class Solution {
	public static int thirdMax(int[] nums) {
		int n = 0;
		Arrays.sort(nums);
		if (nums.length < 3)
			return nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			if (n >= 2) {
				return nums[i + 1];
			} else if (nums[i + 1] != nums[i]) {
				n++;
			} else {
			}
		}
		return nums[nums.length - 1];
	}
}

public class MathExample {

	public static void main(String[] args) {
		int[] array = { 3, 2, 1 };
		int answer = Solution.thirdMax(array);
		System.out.println(answer);
	}

}
