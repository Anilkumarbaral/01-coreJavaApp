package arraysClasses;
//find the duplicate elements by using arrya
public class Findthe_DuplicateElement {

	public static void main(String[] args) {
		                     
               		//create and initialize the array
		 int[]ar= {2,1,3,2,5,7,8,3,7,9};
		 //now i want print original array elements
		 
		 for(int i=0;i<ar.length;i++) {
			   System.out.print(ar[i]+" ");
		 }
		 System.out.println();
		 //now find the duplicate element from array
		 System.out.println("now find out the duplicate element");
            for(int i=0;i<ar.length;i++) {
            	  for(int j=i+1;j<ar.length;j++) {
            		     if(   ar[i]==ar[j]) {
            		    	 System.out.print(ar[j]+" ");
            		     }
            	  }
            }
	}

}
