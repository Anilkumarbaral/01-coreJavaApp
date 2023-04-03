package arraysClasses;
import java.util.Arrays;
import java.util.Scanner;
public class Test_arrayobjectDynamicsizeAndValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		     System.out.println("how many values do you want to enter: ");
		      int numofvalue=scn.nextInt();
		      System.out.println("entered value:"+numofvalue);
		      
		      int[] ai=new int[numofvalue] ;
		      System.out.println(Arrays.toString(ai));//1.2v
		      
		      
		      for(int i=0;i<numofvalue;i++) {
		    	  System.out.println("enter value: "+(i+1));
		    	   ai[i]=scn.nextInt();
		    	 //  System.out.println(ai[i]);
		    	  System.out.println(Arrays.toString(ai));
		      }
		

	}

}
