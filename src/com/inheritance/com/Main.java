package com.inheritance.com;

 class animal{
	String fname="animal firstname";
	public void animalsound() {
		System.out.println("animal sound ");
	}
}

 class dog extends animal{
	 String lname="child name";
	 public void childanimalsound() {
			System.out.println("child animal sound ");
		}
	 
 }
  class puppydog extends dog{
	  String pname = "puppy dog name";
	  public void puppydogsound() {
		  System.out.println("puppy dog sound is ");
	  }
  }
 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog mydogobj=new dog();
		
		puppydog mypuppydogobj=new puppydog();
		
		

	}

}
