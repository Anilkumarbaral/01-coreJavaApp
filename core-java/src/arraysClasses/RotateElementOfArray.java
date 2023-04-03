package arraysClasses;

import java.util.Scanner;

public class RotateElementOfArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create and initialize array
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		// print the original array element
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		// create a variable that added the last value of array after rotate
		Scanner scn = new Scanner(System.in);
		System.out.println("\n pls enter how many times u want to rotate");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {//outer loop
			// iterate
			int firstvalue = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			} // inner for loop
			arr[arr.length - 1] = firstvalue;
		} // outer for loop
		System.out.println();
		System.out.println("lets print the rotate element of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}

	}

}
