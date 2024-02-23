package com.recursion.com;

public class Factorialexmpl {
	
	public static int multiply(int n) {
		if(n>0) {
			return n*multiply(n-1);
		}else {
			return 1;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=multiply(5);
		System.out.println(res);

		

	}

}



