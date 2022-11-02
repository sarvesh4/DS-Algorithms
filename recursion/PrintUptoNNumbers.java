package com.sarvesh.recursion;

public class PrintUptoNNumbers {
	public static void main(String[] args) {
			
			int i=0;
	        increase(i);
		}
		
		static void increase(int a){
		    if (a==5) return;
		    a++;
		    increase(a);
		    System.out.println(a+" ");
	    }
}
