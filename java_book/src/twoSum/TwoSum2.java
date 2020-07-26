package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

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
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i < nums.length; i++) {		
			if(map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]), i};
			}			
			map.put(target - nums[i], i);
		}		
		return new int[] {0, 1};
	}

}
