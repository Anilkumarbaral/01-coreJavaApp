package arraysClasses;

import java.util.Scanner;

public class TheTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            Scanner scn=new Scanner(System.in);
	            //pls enter array size
	            System.out.println("pls enter size");
	            int n=scn.nextInt();
	            //create array and copy the size from given number
	            int ar[]=new int[n];
	            //initilize the value
	            System.out.println();
	            for(int i=0;i<ar.length;i++) {
	            	System.out.println("enter value: "+(i+1));
	            	           ar[i]=scn.nextInt();
	            }
	            //ask the target value element
	            System.out.println("pls pass the target value");
	            int target=scn.nextInt();
	            for(int i=0;i<ar.length;i++) {
	            	
	            	   if(target==ar[i]) {
	            		   System.out.println("index number: "+i);
	            		   return;
	            	   }//if
	            	   
	            }//for
	            System.out.println("-1 ");
	            
	            		

	}

}
