package interview.strings;

import java.util.Scanner;

public class UsingSwitchCase {

	public static void main(String[] args) {
		          Scanner scn=new Scanner(System.in);
		               System.out.println("pls enter fruit name");
		          String fruitName=scn.next();
		          switch(fruitName) {
		          
		          case "Mango":	   
		          System.out.println("sweet");
		                break;
		          case "potato":
		        	  System.out.println("neutral");
		        	  break;
		          case "apple":
		        	  System.out.println("delicious");
		        	  break;
		          case"jackfruit":
		        	  System.out.println("yami");
		        	  break;
		        	  default:
		        		  System.out.println("not in a list");
		          }
		          
	}

}
