package arraysClasses;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //initialize array
		    int []ar= {1,4,8,10,3,8,9,0,10,32,23,22};
		    
		    //now printing the even position that hold the array
		    System.out.println("now printing the even position of array");
         
		    for(int i=1;i<ar.length;i=i+2) {
		    	   System.out.println("even position "+ar[i]);
		    }
		    
	}

}
