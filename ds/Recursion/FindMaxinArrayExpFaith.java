package com.sarvesh.ds.Recursion;

public class FindMaxinArrayExpFaith {
	
	public static void main(String[] args) {
		
		
	int nums[] = {1, 4, 5, 8, 172, 64, 54, 42, 25};
	int numMax = findMax(nums,0);
	System.out.println("Max in Array is " +numMax);
	
	}

	private static int findMax(int[] nums, int i) {
		
		if(i == nums.length -1) {
			return nums[i];
		}

		int maxOfSubarray = findMax(nums,i+1);
		
		if(nums[i] > maxOfSubarray) {
			return nums[i];
		}
		else
			return maxOfSubarray;		
	}

}
