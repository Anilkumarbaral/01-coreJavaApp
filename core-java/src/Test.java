import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = reverseNumber(s1);
		System.out.println("Original number: " + s1);
		System.out.println("reversNumber: " + s2);

	}

	private static String reverseNumber(String s) {
	//	String st = "";
		StringBuilder sb = new StringBuilder();
		String[] words = s.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			//st = st.concat(words[i]+" ");
			sb.append(words[i]);
		    sb.append(" ");
		}
	//	sb.toString().trim();

		return sb.toString().trim();
	}

}
