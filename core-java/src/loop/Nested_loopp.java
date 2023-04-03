package loop;

import java.util.Scanner;

public class Nested_loopp {

	public static void main(String[] args) {
	
		    //chekcing for blood donner eligibility
		 
		     Scanner scn=new Scanner(System.in);
		     System.out.println("pls enter the height: ");
		                 int height=scn.nextInt();
		                 System.out.println("pls enter the weight : ");
		                 int weight=scn.nextInt();
		                 
		                 if(height>5 && height<7) {
		                	 if(weight>50 && weight<90) {
		                		 System.out.println("donner is eligiblity for blood donate  ");
		                	 }
		                 }
		                 else {
		                	 System.out.println("donner is not eligibility for blood donate");
		                 }

	}

}
