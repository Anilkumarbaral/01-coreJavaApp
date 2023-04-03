package arraysClasses;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter array size");
		//create int type array
		int  n=scn.nextInt();
		System.out.println("now enter the value");
		int []arr1=new int[n];
		//enter the value in array size
		for(int i=0;i<arr1.length;i++) {
		
			    arr1[i]=scn.nextInt();
		}
		//enter the element cheking
		System.out.println("pls enter the frq check num");
		int frq=scn.nextInt();
		int counter =0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==frq) {
				counter ++;
			}
			else {
				continue;
			}
		}//for
		System.out.println("frequency of number"+frq+"is :"+counter);
		
		

	}

}
