package loop;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	         Scanner scn=new Scanner(System.in);
	         System.out.println("pls enter week name");
		   String day=scn.next();
		   
		   switch(day) {
		   
		   case "monday":
			   System.out.println("today is monday very good day to plan ur schedule");
			   break;
		   case "tuesday":
			   System.out.println("today is tuesday its working day");
			   break;
		   case "wednesday":
			   System.out.println("today is wednesday its non veg eating day");
			   break;
		   case "thursday":
			   System.out.println("today is thursday  is good");
			   break;
		   case "friday":
			   System.out.println("todday is friday");
			   break;
		   case "saturday":
		   System.out.println("today is saturday");
		   break;
		   case "sunday":
			   System.out.println("today is sunday");
			   
		   default:
			 System.out.println("this is not list");  
		   }

	}

}
