package string;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int Vcounts = 0;
		int Ccounts = 0;
		while (true) {
			System.out.println("pls enter String: ");
			String s = scn.nextLine();
			String s1 = s.toLowerCase();
			if (s.isEmpty()) {
				System.out.println("pls do not pass empty");
				continue;
			} else {
				try {
					for (int i = 0; i < s.length(); i++) {
						char ch = s.charAt(i);
						if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
							Vcounts++;

						}else {
							Ccounts++;
						}
					}

				} catch (NumberFormatException nfe) {
					System.out.println("pls pass only String/words");
				}
			}
			System.out.println("number of vowels: "+Vcounts);
			System.out.println("number of consonent: "+Ccounts);
		}
		

	}

}
