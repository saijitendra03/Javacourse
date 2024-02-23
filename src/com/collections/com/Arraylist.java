package com.collections.com;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("benz");
		cars.add("audi");
		cars.add("bmw");
		cars.add("creta");
		cars.forEach((n) ->{System.out.println(n);});
		/*
		 * System.out.println(cars.size()); for(String i : cars) {
		 * System.out.println(i); }
		 */
		/*
		 * for(int i=0; i<cars.size();i++) { System.out.println(cars.get(i)); }
		 */
		//System.out.println("before change" +cars.get(1));
		/*
		 * cars.set(1, "nios"); System.out.println("after change" +cars.get(1));
		 */
		

	}

}
