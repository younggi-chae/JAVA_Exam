package kosta.algorithm;

public class TwoSum {		

		public static int[] twoSum(int[] nums, int target) {			
				
			for(int i = 0; i < nums.length; i++) {
				for(int j = i+1; j < nums.length; j++) {					
					if(nums[i] + nums[j] == target) {						
						return new int[] {i, j};
					}
				}
			}
			throw new IllegalArgumentException("No two sum solution");
		}
		public static void main(String[] args) {

			int[] nums = { 5, 10, 15, 24, 8, 7 };
			
			int[] result= twoSum(nums, 15);
			System.out.println(result[0] + ", " + result[1]);
			
		}
	}