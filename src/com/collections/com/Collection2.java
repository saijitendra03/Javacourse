package com.collections.com;

import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> mylist = new LinkedList<String>(); 
		mylist.add("usa");
		mylist.add("uk");
		mylist.add("australia");
		mylist.add("canada");
		mylist.addFirst("india");
		mylist.addLast("korea");
	
		System.out.println(mylist.getFirst());

	}

}
