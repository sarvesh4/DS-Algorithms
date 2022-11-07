package com.sarvesh.iteration;

public class Anagram {
	public static void main(String[] args) {
		String x= "Sarvesh";
		String res = ""; 
		int length = x.length();
		
		for(int i=length-1;i>=0;i--) {
			res= res + x.charAt(i);
		}
			if(res.equals(x))
				System.out.println("Anagram");
			else
				System.out.println("Not an Anagram");
	}

}
