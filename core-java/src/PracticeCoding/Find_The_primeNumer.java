package PracticeCoding;

import java.util.Scanner;

public class Find_The_primeNumer {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter number");
		    int num=scn.nextInt();
		    if(num%2==0) {
		    	System.out.println("this is even number : "+num);
		    }
		    else
		    	System.out.println("this is odd number :"+num);

	}

}
