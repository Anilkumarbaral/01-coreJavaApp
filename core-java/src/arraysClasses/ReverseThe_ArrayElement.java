package arraysClasses;

public class ReverseThe_ArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the array
		int[]ar= {1,2,3,4,5};
		//now print the original array elements
		System.out.println("printing the original array element");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
            System.out.println();
            System.out.println("now print the reverse the array element");
            for(int i=ar.length-1;i>=0;i--) {
            	System.out.print(ar[i]+" ");
            }
	}

}
