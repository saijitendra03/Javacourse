package com.polymorphism.com;
 class bank{
	 public int homeloan() {
			return 12;
		}
	
	public int getroi() {
		return 3;
	}
 }
 class sbi extends bank{
	public int getroi() {
		return 7;
	}
 }
 class hdfc extends bank{
	public int getroi() {
		return 8;
	}
 }
public class Exmethodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi s= new sbi();
		hdfc h =new hdfc();
		System.out.println(" sbi roi is " +s.getroi());
		System.out.println(" hdfc  roi is " +h.getroi());
		

	}

}
