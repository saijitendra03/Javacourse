package com.polymorphism.com;

class animal{
	public void animalsound(){
		System.out.println("animal  sound ");
	}
	public void noise(){
		System.out.println("noise sound ");
	}
	
}


class dog extends animal{
	public void animalsound(){
		System.out.println("dog  sound ");
	}
}

class cat extends animal{
	public void animalsound(){
		System.out.println("cat  sound ");
	}
}
public class Polyexample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal myanimalobj=new animal();
		myanimalobj.animalsound();
		animal mydog= new dog();
		//dog mydog1 = new dog();
		
	
		mydog.animalsound();
		animal mycat = new cat();
		mycat.animalsound();

	}

}
