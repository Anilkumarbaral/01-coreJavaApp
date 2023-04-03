package string;

import java.util.Scanner;

public class ProgramTo_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("pls enter String: ");
		        String s=scn.nextLine();
		        boolean bo=searchin(s);
		        if(bo==true) {
		        	System.out.println("Hari is available");
		        }else {System.out.println("Hari is not available");}

	}

	private static boolean searchin(String s) {
		
		s=s.toLowerCase();
		
		return s.indexOf("hari")!=-1;
		
		
	}

}
