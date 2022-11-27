package com.sarvesh.ds.Recursion;

public class FindMinInArrayExpFaith {
	
public static void main(String[] args) {
		
		int nums[] = {172, 28, 1, 4, 5, 8, 172, 64, 54, 42, 25};
		int minNum = findMin(nums,0);
		System.out.println("Minimum number is " +minNum);
	
	}

	private static int findMin(int[] nums, int i) {
		
		if(i == nums.length-1)
			return nums[i];
		
		int minNumber = findMin(nums,i+1);
		
		if(minNumber > nums[i])
			return nums[i];
		else
			return minNumber;

}

}
