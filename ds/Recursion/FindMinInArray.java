package com.sarvesh.ds.Recursion;

public class FindMinInArray {
	
	public static void main(String[] args) {
		
		int nums[] = {-1, 4, 5, 8, 22, 15, 18, 20, 84, -172, 64, 54, 42, 25, 12, 8, 3, 2, 1};
		int n = nums.length;
		
		int minNumber = findMin(nums,n);
		System.out.println("Max Number is "+minNumber);

		}

		private static int findMin(int[] nums, int n) {
			
			if(n==1) {
				return nums[0];
			}
			
			return Math.min(nums[n-1],findMin(nums,n-1));
			
		}

}
