package com.recursion.com;

public class Sumbetweennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=sumbtw(6,12);
		System.out.println(res);

	}
	public static int sumbtw(int s , int e){
		if(e>s) {
			return e+sumbtw(s,e-1);
		}else {
			return e;
		}
		
	}

}

/*
 * sumbtw(6,12) 12+sumbtw(6,11) 12+11+sumbtw(6,10) 12+11+10+sumbtw(6,9)
 * 12+11+10+9+sumbtw(6,8) 12+11+10+9+8+sumbtw(6,7) 12+11+10+9+8+7+sumbtw(6,6)
 */
//12+11+10+9+8+7+6