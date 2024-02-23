package com.oops;

public class Sampledemomethods {
	public void carmodel() {
		System.out.println("car model is benz");
	}
	public void carspeed(int maxspeed) {
		System.out.println("my car speed is "+maxspeed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//carmodel();
		Sampledemomethods myobj1=new Sampledemomethods();
		myobj1.carspeed(50);
		
		

	}

}
