package com.inheritance.com;
// super class (parent class)
 class Vehicle {
 String brand="benz";
 public void speed() {
	 System.out.println("this is vehicle speed ");
	 
 }
}
// sub class(child class)
 class car extends Vehicle{
	String model="xyz";
	public static void main(String[] args) {
		car mycarobj= new car();
		System.out.println(mycarobj.brand);
		mycarobj.speed();
		
		//Vehicle mycarobj2= new Vehicle();
		
	}
 }