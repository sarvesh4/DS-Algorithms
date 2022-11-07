package com.sarvesh.recursion;

public class TowerOfHanoiRecursion {
	
	 public static void main(String[] args) {
		 int n=5;
		 towerOfHanoi(n,'A','B','C');
	 }

	private static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod) {
	
		if(n==1) {
			System.out.println("Transfer disk 1 from "+ from_rod + " to rod " + to_rod);
			return;
		}
		
		towerOfHanoi(n-1,from_rod,helper_rod,to_rod);
		System.out.println("Take disk " + n + " from "+ from_rod + " to rod " + to_rod);
		towerOfHanoi(n-1,helper_rod,to_rod,from_rod);
		
	}

}
