package com.sarvesh.recursion;

public class FibonacciRecursion {
	public static void main(String[] args) {
		int n=9;
		int res = fibo(n);
		System.out.println(res);
		
	}

	private static int fibo(int n) {
		if (n==0||n==1)
			return n;
		return (fibo(n-1) + fibo(n-2));
	}

}
