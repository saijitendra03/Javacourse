package loopstatements;

public class Foreachexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String[] fnames={" SAI ","vani","rani","sanjay","vijay",
		 * "ajay","rohith","vanitha"}; for(String i:fnames) { System.out.println(i); }
		 */
		int[] fnum= {5,8,9,4,2};
		fnum[1]=10;
		for(int i:fnum) {
			System.out.println(i);
		}
		

	

}
}