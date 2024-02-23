package statements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sscresult = "YES";
		String interresult = "YES";
		String degresult="NO";

		if (sscresult == "YES") {
			System.out.println("student is 10th pass");
			if (interresult == "YES") {

				System.out.println("student is inter pass");
				if(degresult=="YES") {
					System.out.println("student is degree pass and go for a job");
					
				}else {
					System.out.println("student is degree fail");
				}

			} else {
				System.out.println("student is inter fail");
			}
		} else {
			System.out.println("student is 10th fail");

		}

	}

}
