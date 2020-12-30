package my.project;

public class MathExample {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12, 4};
		for (int i = 0, j = 0; i + j >= nums.length - 2; i++) {
			if (nums[i] == 0 && nums[nums.length - 1 - j] != 0) {
				int temp = nums[i];
				nums[i] = nums[nums.length - 1 - j];
				nums[nums.length - 1 - j] = temp;
				j++;
			}
		}
		
		
		
		for(int e : nums) {
			System.out.print(e + " ");
		}
	}

}
