package string;

import java.util.Scanner;

public class Program2_characterReader {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		  System.out.println("pls enter String: ");
		    String data=scn.nextLine();
		        int noOfchar=data.length();
		        for(int i=0;i<noOfchar;i++) {
		     System.out.println("character "+(i+1)+" is :"+data.charAt(i));
		        }

	}

}
