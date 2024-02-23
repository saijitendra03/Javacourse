package com.collections.com;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] myarray={ 1,2,3,4,5};
			System.out.println(myarray[10]);
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			System.out.println("something is wrong");
		}finally {
			System.out.println("program is succesfully executed ");
		}

	}

}
