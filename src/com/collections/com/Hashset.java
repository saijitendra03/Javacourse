package com.collections.com;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> myset= new HashSet<String>();
		ArrayList<String> myset= new ArrayList<String>();
		myset.add("java");
		myset.add("python");
		myset.add("java");
		myset.add("sql");
		//System.out.println(myset.contains("testing"));
		/*
		 * for(String i:myset) { System.out.println(i); }
		 */
		Iterator<String> myobj= myset.iterator();
		while(myobj.hasNext()) {
			 System.out.println(myobj.next());

		}
		
	}

}
