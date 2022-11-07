package com.sarvesh.ds.Recursion;

public class TowerOfHanoiRecursion {
	
	 public static void main(String[] args) {
		 int n=3;
		 towerOfHanoi(n,'A','B','C');
	 }

	private static void towerOfHanoi(int n, char from_rod, char helper_rod, char to_rod) {
	
		if(n==1) {
			System.out.println("Disk 1 moved from "+ from_rod + " to " + to_rod);
			return;
		}
		
		towerOfHanoi(n-1,from_rod,to_rod,helper_rod);
		System.out.println("Disk " + n + " moved from "+ from_rod + " to " + to_rod);
		towerOfHanoi(n-1,helper_rod,from_rod,to_rod);
		
	}

}
