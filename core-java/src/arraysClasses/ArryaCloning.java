package arraysClasses;

import java.util.Arrays;

public class ArryaCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array with initialize
		int []ai= {10,20,30,40,50};
		//printing the original array
		System.out.println(Arrays.toString(ai));
		System.out.println("using to string method");
		for(int i:ai) {
			System.out.println(i);
		}//for
		System.out.println();
		System.out.println("now print the clone of array");
		//now do the deep copying
		//creating a copy of object in different memory location
		int []copyai=ai.clone();
		//now print the the copy object
		for(int i:copyai) {
			System.out.println(i);
		}
		System.out.println();
//now create shallow copy
		System.out.println("now create shallow copy");
		int []shallowai=ai;
		System.out.println(shallowai);
		for(int i:shallowai) {
			System.out.println(i);
		}//for
		
		System.out.println("let check clone and orginal is equal");
		System.out.println(ai==copyai);
		if(ai==copyai)
			System.out.println("this is true");
		else
			System.out.println("this is false");
	}

}
