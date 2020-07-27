package kosta.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {

	public static void main(String[] args) {

		int[] nums = { 6, 4, 3, 8, 7, 5, 2 };
		int[] result = twoSum(nums, 5);
		System.out.println(result[0] + ", " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i1 = 0; i1 < nums.length; i1++) {
			Integer i2 = map.get(target - nums[i1]);
			if(i2 != null && i1 != i2) {
				return new int [] {i1, i2};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
