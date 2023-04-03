import java.util.Scanner;

public class Date_26_1_SubFind_Hari {

	public static void main(String[] args) {
	//	String name = "java faculty is hari krishna";
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter name:  ");
		               String name=scn.nextLine();

		/// now find out hari is present or not

		boolean b = searchstring(name);
		if (b == true)
			System.out.println("hari is available");
		else
			System.out.println("hari is not available");

	}

	private static boolean searchstring(String name) {
		String s = name.toLowerCase();

		return s.indexOf("har") != -1;
	}

}
