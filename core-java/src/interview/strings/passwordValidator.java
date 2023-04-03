package interview.strings;

import java.util.Scanner;

public class passwordValidator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean upperCharfound = false;
		boolean supperCharfound = false;
	//	boolean digitfound = false;
		boolean whitespace = false;

		while (true) {
			System.out.println("pls enter password: ");
			String password = scn.nextLine();
			int len = password.length();

			if (len < 8 || len > 16) {
				System.out.println("password should be btw 8 and 16");
				// continue;
			} else {
				for (int i = 0; i < len; i++) {
					char ch = password.charAt(i);
					if (Character.isLetter(ch)) {
						if (Character.isUpperCase(ch)) {
							upperCharfound = true;
						}
					} else {
						supperCharfound = true;
					}
				} // for
				if (upperCharfound == true && supperCharfound == true) {
					System.out.println("successfully registered");
					break;
				}

//		                        	    	         }//for
//		                        	    	         if(digitfound==true  && supperCharfound==true &&upperCharfound==true) {
//		                        	    	        	   System.out.println("successfully registered");
//		                        	    	        	   break;
				else {
					System.out.println("password shoud have one Uppercase");
					System.out.println("password shoud have digit");
					System.out.println("password shoud have  length btwn 8 & 16");
				}

			} // else

		}

	}
}
