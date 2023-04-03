package interview.strings;

import java.util.Scanner;

public class FindOutThevoulsandConsonant {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// dispalying one message to enter the strings
		System.out.println("enter the strings");
		String s1 = scn.nextLine();
		String s2 = s1.toLowerCase();

		// im taking two integer for counting vowels and consonant
		int cvowel = 0;
		int cconsonant = 0;
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
				cvowel++;
			} else {
				cconsonant++;
			}

		}
		System.out.println("total vowels contains :" + cvowel);
		System.out.println("total vowels consonant :" + cconsonant);
	}

}
