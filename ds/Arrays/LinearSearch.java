package com.sarvesh.ds.Arrays;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int nums[] = {1, 30, 40, 50, 60, 70, 90, 23, 20};
		int x = 23;
		int result = findNumberLinear(nums,x);
		if(result==1)
			System.out.println("Number is present in the array");
		else
			System.out.println("Number is not present in the array");
	}

	private static int findNumberLinear(int[] nums,int x) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==x)
				return 1;
		}
		return -1;
	}

}
