package com.polymorphism.com;
class addition{
	public int myadd(int a, int b) {
		return a+b;
	} 
	public double myadd(double a, double b) {
		return a+b;
	}
	public int myadd(int x, int y, int z) {
		return x+y+z;
	}
}

public class Exmethodoverload {
	

	public static void main(String[] args) {
		
		addition myobj1 = new addition();
		System.out.println(myobj1.myadd(3, 5));
		System.out.println(myobj1.myadd(3.6, 5.2 ));
	}

}
