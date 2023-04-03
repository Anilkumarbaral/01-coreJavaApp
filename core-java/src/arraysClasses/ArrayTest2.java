package arraysClasses;
import java.util.Scanner;
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read 10 int from end user from keyword and store in java program
		Scanner scn=new Scanner(System.in);
		System.out.println("how many number do you want to enter? :");
		      int no_ofvalues=scn.nextInt();
		      int[]ia=new int[no_ofvalues];
		      System.out.println("array object is created with length "+no_ofvalues);
		      
		        System.out.println("in reading no from end user from keyboard");
		        for(int i=0;i<no_ofvalues;i++) {
		        	
		        	System.out.println("Enter number "+(i+1)+":");
		        	ia[i]=scn.nextInt();
		        	System.out.println("  "+ia[i]+"  is stored in array in");
		        }//for
		    System.out.println("in reading and displaying values from array");  
		for(int i=0;i<ia.length;i++) {
			System.out.println("number at index "+i+":"+ia[i]);
		}

	}

}
