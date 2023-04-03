package daily.coding;

import java.util.Scanner;

public class Date_26_Using_TernaryOperator {

	public static void main(String[] args) {
		//without using ternaryOperator 
		
		        //find the is negative or positive
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter number");
		            int x=scn.nextInt();
					/*
					 * if(x>0) System.out.println("it is positive number"); else
					 * System.out.println("it is negative number");
					 */
		       
		       //approach two using ternary operator
		       String number=(x>0)?"it positive number":"negative nubmer";
		       System.out.println(number);

	}

}
