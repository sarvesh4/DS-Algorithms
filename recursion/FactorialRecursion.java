package com.sarvesh.recursion;

public class FactorialRecursion {
	public static void main(String[] args)
    {
		int n=4;
		int res=fact(n);
		System.out.println(res);
    }

	static int fact(int i)
    {
		if (i==0||i==1) return 1;
		return i * fact(i-1);
        //return n * factorial(n - 1);
    }
}
