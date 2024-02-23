package com.polymorphism.com;

public class Methodiverloading {
	
	public int add(int x, int y) {
		return x+y;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Methodiverloading myobj1 = new  Methodiverloading();
		System.out.println( myobj1.add(2, 3));
		System.out.println( myobj1.add(2, 3, 5));

	}

}
