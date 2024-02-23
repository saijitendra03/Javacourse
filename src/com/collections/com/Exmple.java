package com.collections.com;

public class Exmple {
	public static void mymethod(int age) {
		if(age<=18) {
			throw new ArithmeticException("not elegible to vote");
			//System.out.println("not eligible to vote");
		}else {
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(15);

	}

}
