package arraysClasses;
//java support anonymous array so dont need declare array while pssing to method
public class AnnomousArray {
	//create a method which recieve the passing an array parameter
          static void printarray(int[]arr) {
        	        for(int i=0;i<arr.length;i++) {
        	              System.out.println(arr[i]);
        	        }
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //passing anonymous array to method
	printarray(new int[]{2,4,5,1});
	}

}
