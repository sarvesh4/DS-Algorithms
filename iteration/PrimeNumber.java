package com.sarvesh.iteration;

public class PrimeNumber {
	 public static void main(String[] args) {

	        System.out.println(Prime(8));
	    }

	    static boolean Prime(int n) {

	        if (n < 2)
	            return false;

	        for (int i = 2; i < n; i++) {
	            if (n % i == 0)
	                return false;

	        }

	        return true;


	    }
}
