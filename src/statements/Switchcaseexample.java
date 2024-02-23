package statements;

public class Switchcaseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s="saffron"; String w="white"; String g="green";
		 */
		/*
		 * String input="x"; if(input=="s") { System.out.println("saffron"); } else if
		 * (input=="w"){ System.out.println("white");
		 * 
		 * }else if(input=="g") { System.out.println("green"); } else{
		 * System.out.println("no valid input");
		 * 
		 * }
		 */
		String input="G";
		switch(input.toLowerCase()) {
		case "s":
			System.out.println("saffron");
			break;
		case "w":
			System.out.println("white");
			break;
		case "g":
			System.out.println("green");
			break;
		default:
			System.out.println("no valid input");
		
		
			
		
		}

	}

}
