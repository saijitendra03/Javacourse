package com.oops;

public class Exclass {
	
	  int x=5;
	 String fname="Rohith";
	 static void mysamplemethod() {
		 System.out.println("this is a static method");
	 }
	 public void mypublicmethod() {
		 System.out.println("this is a public method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exclass myobj1=new Exclass();
		Exclass myobj2=new Exclass();
		myobj1.x=10;
		System.out.println(myobj1.x);
		System.out.println(myobj2.fname);
		mysamplemethod();
		myobj1.mypublicmethod();

	}

}
