package com.recursion.com;

public class Recursionexample {
	public static int sum(int n) {
		if(n>0) {
			return n+sum(n-1);
		} else {
			return 0;
		}
		
	}


	public static void main(String[] args) {
		
		
		int res=sum(100);
		System.out.println(res);

	} 
	
	
}


