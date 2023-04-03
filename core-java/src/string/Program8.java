package string;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		while(true) {
			Scanner scn= new Scanner(System.in);
			   System.out.println("pls enter your password: ");
			   String pwd=scn.nextLine();
			   if(pwd.isEmpty()) {
				   System.out.println("pls dont pass empty number..");
				   continue;
				   
			   }else {
				   int len=pwd.length();
				   if(len<8 || len>16){
			   System.out.println("password should be in btween 8 and 16 character");
			         continue;
				   }else {
					   System.out.println("u have successfully logined");
					   break;
				   }
			   }
		}

	}

}
