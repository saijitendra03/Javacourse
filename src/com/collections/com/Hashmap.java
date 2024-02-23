package com.collections.com;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> mymap= new HashMap<String,String>();
		mymap.put("ts", "hyd");
		mymap.put("ap", "amv");
		mymap.put("wb", "kol");
		mymap.put("bh", "ptn");
		//System.out.println(mymap);
		/*
		 * System.out.println(mymap.get("ts")); System.out.println(mymap.size());
		 */
		for(String i:mymap.keySet()) {
			System.out.println("key is "+i+ "value is "+mymap.get(i));
		}
		/*
		 * for(String i:mymap.values()) { System.out.println(i); }
		 */
		
	

	}

}
