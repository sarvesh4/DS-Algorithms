package com.sarvesh.ds.Iteration;

public class FactorialIteration {
	public static void main(String[] args) {
		int n=4,res=1;
		
		for(int i=1; i<=n; i++) {
			res=res*i;
		}
		System.out.println("Factorial :" +res);
	}
}
