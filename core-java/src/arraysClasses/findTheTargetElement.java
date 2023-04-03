package arraysClasses;
//find the target element from array

import java.util.Scanner;

public class findTheTargetElement {

	public static void main(String[] args) {
		//create scanner class
		Scanner scn=new Scanner (System.in);
		//create array size
		  System.out.println("pls enter array size");
		      int no=scn.nextInt();
		      //create array
		      int []element=new int[no];
		      //store element into the array
		      for(int i=0;i<no;i++) {
		    	          System.out.println("pls enter element: "+(1+i));
		    	     element[i]=scn.nextInt();
		      }//for
            System.out.println("successfully element stored");  
            System.out.println("pls enter target number: ");
                int target=scn.nextInt();
                //for finding the target number from array object
                //im taking for loop
                
                for(int i=0;i<element.length;i++) {
                	if(target==element[i]) {
                		  System.out.println("index no is: "+i);
                		  return;
                	}//
                }//
              System.out.println("record not found");  
	}

}
