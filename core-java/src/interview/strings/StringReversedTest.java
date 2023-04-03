package interview.strings;

import java.util.Scanner;

public class StringReversedTest {

	public static void main(String[] args) {
		  Scanner scn=new Scanner(System.in);
		  System.out.println("\n pls enter string");
		  String s1=scn.nextLine();
		      System.out.println("u enterd   "+s1);
		      String result=reversedstringString(s1);
		      System.out.println("after reversed \n"+result);

	}
	static String reversedstringString (String s1) {
		    
		                  String []s2 =s1.split(" ");
		                      String count="";
		                  for(int i=((s2.length)-1);i>=0;i--) {
		                	          count=count+s2[i]+" ";
		                  }
		 return count;
	}

}
