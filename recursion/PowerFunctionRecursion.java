package com.sarvesh.recursion;

public class PowerFunctionRecursion {
	public static void main(String[] args)
    {
		int i=3,j=3;
		int res = recursion(i,j);
		System.out.println(res);
    }

	private static int recursion(int i,int j) {
		
		if (j==0||j==1) return i;
		return i * recursion(i,j-1);
		
	}
}
