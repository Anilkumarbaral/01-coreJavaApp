package arraysClasses;

import java.util.Arrays;

public class GrowableArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[]arr=new Object[5];
		//no initialilze the value
		arr[0]="a";
		arr[1]=1;
		arr[2]="b";
		arr[3]=96.0;
		arr[4]="c";
	//	arr[5]="d";
		System.out.println(Arrays.toString(arr));
     // for this issue we can create a new array with double value
		Object[]temparr=new Object[arr.length*2];
		//now we can assign from old to new array
		 // by using array
		for(int i=0;i<arr.length;i++) {
			       temparr[i] =arr[i];
		}//for
		// now we can assign new array reference to old one
		          arr=temparr;//assigning only variable reference for pointing the new array object
		          //now we can store the value without AIOOBE
		          arr[5]="d";
		          System.out.println(Arrays.toString(arr));
		          
	}

}
