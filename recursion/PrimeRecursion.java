package com.sarvesh.recursion;

public class PrimeRecursion {
	
	 public static void main(String[] args) {
		 
		 int n=37;
		 n=prime(n,n/2);
		 
		 if(n==1) {
			 System.out.println("Number is a prime number");
		 }
		 else
			 System.out.println("Number is not a prime number");
		 
	 }

	private static int prime(int n, int i) {
		
		if(i==1)
			return 1;
		if(n%i==0)
			return 0;
		return prime(n,i-1);
	}

}
