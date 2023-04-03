package arraysClasses;

public class FindtheSmallestElement_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {10,30,90,100,20,80,70,60};
		//i am taking one varible and initilize the first index value and compare with rest elements
		int min=ar[0];
		          //by iterating 
		          for(int i=0;i<ar.length;i++) {
		        	      if(ar[i]<min)
		        	    	  min=ar[i];
		        	      
		          }
		          System.out.println("the min element of array is: "+min);

	}

}
