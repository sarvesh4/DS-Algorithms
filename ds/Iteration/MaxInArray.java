package com.sarvesh.ds.Iteration;

public class MaxInArray {
		
		public static void main(String[] args) {
		
		
		int nums[] = {1, 4, 5, 8, 172, 64, 54, 42, 25};
		int n = nums.length;
		
		int maxNumber = findMax(nums,n);
		System.out.println("Max Number is "+maxNumber);

		}

		private static int findMax(int[] nums, int n) {
			
			if(n==1) {
				return nums[0];
			}
			
			return dummyfunction(nums[n-1],findMax(nums,n-1));
			
		}

		private static int dummyfunction(int a, int b) {
			
			if(a>=b) {
				return a;
			}
			else
				return b;
		}
	
}
