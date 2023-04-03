package string;

import java.util.Scanner;

public class Program_checkVC {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("pls enter alphabet");
              String s=scn.nextLine();
              String s1=s.toLowerCase();
              int Vcount=0;
              int Ccount=0;
              for(int i=0;i<s.length();i++) {
            	      char ch=s1.charAt(i);
            	      if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u') {
            	    	  Vcount++;
            	      }else {
            	    	  Ccount++;
            	      }
              }
              System.out.println("total vowels: "+Vcount);
              System.out.println("total consonent: "+Ccount);
             
	}

}
