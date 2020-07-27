package kosta.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

	//HashMap
	//key : 6 4 3 8 7 5 2
	//value : 0 1 2 3 4 5 6
	public static void main(String[] args) {
		
		int[] nums = { 6, 4, 3, 8, 7, 5, 2 };						
		int[] result = twoSum(nums, 5);

		for (int i : result) {
			System.out.print(i + ",");
		}

	}
	
	public static int[] twoSum(int[] nums, int target) {
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