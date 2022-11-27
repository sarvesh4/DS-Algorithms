package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void main(String[] args) {
		
		int nums[] = {0, 172, 28, 0, 1, 4, 0,  5, 8, -2, 64, 0, 54, 42, 0, 25};
		moveZerosToEnd(nums);
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);}
	}

	static void moveZerosToEnd(int[] nums) {
		
		int z=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				swap(nums,z,i);
				z++;
			}
		}		
	}

	static void swap(int[] nums, int z, int i) {
		int temp=nums[z];
		nums[z]=nums[i];
		nums[i]=temp;		
	}

}
