package PracticeCoding;

import java.util.Scanner;

public class palindrome_inString {

	public static void main(String[] args) {
		//declaring string variable two
		
		String original,reverse="";
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter strings :");
		original=scn.next();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			   reverse=reverse+original.charAt(i);
		}//
		if(original.equals(reverse)) {
			  System.out.println("this is string palindrome ");
		}
		else {
			System.out.println("this is the not palindrome ");
		}
	}

}
