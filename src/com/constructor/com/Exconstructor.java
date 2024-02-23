package com.constructor.com;

public class Exconstructor {
	int age;
	String fname;
	public Exconstructor(String firstname, int AGE){
		//System.out.println(" my name is " +fname+ " " +"my age is "+age);
		fname=firstname;
		age=AGE;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exconstructor obj6=new Exconstructor("pavan",30);
		System.out.println(" my name is " +obj6.fname+ " " +"my age is "+obj6.age);

	}

}
