package string;

import java.util.Scanner;

public class Progaram11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean upperfound = false;
		boolean digitfound = false;
		boolean spcharfound = false;

		while (true) {
			System.out.println("pls enter password");
			String pwd = scn.nextLine();
			int len = pwd.length();
			if (len < 8 || len > 16) {
				System.out.println("password should be in between 8 and 16 character");

			} else {
				for (int i = 0; i < len; i++) {
					char ch = pwd.charAt(i);
					if (Character.isLetter(ch)) {
						if (Character.isUpperCase(ch)) {
							upperfound = true;
						    } 
						}else {
							spcharfound = false;
					}
				}
				if (upperfound || digitfound || spcharfound) {
					System.out.println("successfully registered .");
					break;
				} else {
					System.out.println("password shoul contain");
					System.out.println("1. one uppercase character");
					System.out.println("2. one  digits");
					System.out.println("3.one special character");
				}

			}

		}

	}
}
