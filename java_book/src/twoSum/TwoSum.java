package twoSum;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 5, 10, 15, 24, 8, 7 };
		int target = 15;
		TwoSum ts = new TwoSum();
		int[] result = ts.twoSum(nums, target);

		for (int i : result) {
			System.out.print(i + ",");
		}

	}

	public int[] twoSum(int[] nums, int target) {
		
		int[] answer = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(i == j) continue;
				if(nums[i] + nums[j] == target) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}
		return answer;
	}
}