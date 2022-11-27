package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class MoveZeroesSnowball {
	
	public static void main(String[] args) {
		
		int nums[] = {0, 172, 28, 0, 1, 4, 0,  5, 8, -2, 64, 0, 54, 42, 0, 25};
		moveZerosToEndSnowball(nums);
		System.out.println(Arrays.toString(nums));
	}



	private static void moveZerosToEndSnowball(int[] nums) {
		
		int snowball = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==0) {
				snowball++;
			}
			else if(snowball > 0) {
				int temp = nums[i];
				nums[i] = 0;
				nums[i-snowball] = temp;
			}
		
		}
		
	}

}