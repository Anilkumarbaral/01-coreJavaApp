package arraysClasses;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_oneArrayToanotherArray {

	public static void main(String[] args) {
		  Scanner scn=new Scanner(System.in);
		     System.out.println("pls enter how many number size want :");
		            int size=scn.nextInt();
		            //create array with size
		            int []arr=new int[size];
		            //iterate and store the element to array
		            for(int i=0;i<size;i++) {
		            	   System.out.println("pls enter element: "+(i+1));
		            	   arr[i]=scn.nextInt();      	   
		            }
             System.out.println("element stored susccessfully ");
             //create another array with same size
             int []arr2=new int[arr.length];
               //now copy from arr to arr2 array object
             
                      for(int i=0;i<arr.length;i++) {
                    	      arr2[i]=arr[i];
                      }
                      System.out.println("copied successfully");
                      System.out.println(Arrays.toString(arr2));
	}

}
