package abstraction;

abstract class animal{
	public abstract void animalsound();
	public void noise() {
		System.out.println("noise");
		
	}
}

  class dog extends animal {
	 public  void animalsound() {
		 System.out.println("dog sound");
	 }
 }
public class EXabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog myobj1= new dog();
		myobj1.animalsound();

	}

}
