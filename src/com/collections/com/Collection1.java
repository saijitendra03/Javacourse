package com.collections.com;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mynum=new ArrayList<Integer>();
		mynum.add(12);
		mynum.add(35);
		mynum.add(16);
		mynum.add(8);
		Collections.sort(mynum);
		for(int i:mynum) {
			System.out.println(i);
		}
		

	}

}
