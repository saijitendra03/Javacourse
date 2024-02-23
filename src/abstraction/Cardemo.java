package abstraction;

abstract class bike{
	abstract void speed();
	
}
 class Cardemo extends bike {
	 public void speed() {
		 System.out.println("speed of bike ");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike myobj= new Cardemo();
		myobj.speed();

	}

}
