package PracticeCoding;

import java.util.Arrays;
import java.util.stream.Stream;

public class Copying_OneArrayTo_anotherArray {

	public static void main(String[] args) {
		//defining  an array
		int[]ar1=new int[5];
	   ar1[0]=5;
	   ar1[1]=6;
	   ar1[2]=7;
	   ar1[3]=8;
	   ar1[4]=9;
	   //defining one more array and copy length of 1st array
	   
	  int []ar2=new int[ar1.length-1];//-1 because of 0 to start otherwise it will increase
	  
      
	   
	   //printing the first array elements
	   
	   for(int a:ar1) {
		   System.out.println(a);
	   }
	   System.out.println();
	   for(int i=0;i<ar1.length;i++) {
		     System.out.println(ar1[i]);
	   }
	   System.out.println();
	   
	 
	   
	    //i want to storing 1st array elements in 2nd array
	   
	   //using  for loop
	   
	   for(int i=0;i<ar1.length-1;i++) {
		       
		          ar2[i]=ar1[i];
	   }
	   System.out.println();
	   
System.out.println(Arrays.toString(ar2));
	}

}
