import java.util.Scanner;

public class reverseNo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter String num:");
		String s1 = scn.nextLine();
		String s2 = reverseCharacter(s1);
		System.out.println(s1.length());
		System.out.println("Original character :" + s1);
		System.out.println(s2);
		System.out.println("reversecharacter: " + reverseCharacter(s1));
		// ja StringBuilder sb = new StringBuilder(s1);
		// System.out.println(sb.reverse());
	}

	public static String reverseCharacter(String st) {
		StringBuilder sbr = new StringBuilder();
		for (int i = st.length() - 1; i >= 0; i--) {
			sbr.append(st.charAt(i));
		}
		return sbr.toString();
	}
}
