package interview.strings;

import java.util.Scanner;

public class PasswordChecking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("pls enter password");
			String password = scn.nextLine();
			if (password.isBlank() || password.isEmpty()) {
				System.out.println("password shouldnot empty");
				 continue;	
			}//if
			if(password.length()<8 || password.length()>16) {
				   System.out.println("pls enter password should be in betwn 8 to 16");
				   continue;
			}
			else {
				   System.out.println("password has been registered susccessfully");
				   break;
			}
			
			
		}
	}

}
