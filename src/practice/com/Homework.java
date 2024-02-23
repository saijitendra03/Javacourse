package practice.com;

class bankaccount{
	int accnum;
	float balence;
	String ownername;
	public bankaccount(int accnum, float balence, String ownername) {
		
		System.out.println("my name is "+ownername+ " acc balence is "  +balence+  " acc number is " +accnum);
	}
	static int mydeposit(int x,int y) {
		return x+y;
		
	}
	static int withdraw(int x,int y) {
		return x-y;
		
	}
}
 class accountmanager{
	 String[] arrbankaccount= {"sbi"};
		static int create(int s,int j) {
			return s+j;
			
		}
	 
	 
 }
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccount myobj1= new bankaccount(10456, 23.64f ,"john");
		int z= bankaccount.mydeposit(6, 4);
		System.out.println(z);
		int f= bankaccount.withdraw(10, 4);
		System.out.println(f);
		
		
		

	}

}
