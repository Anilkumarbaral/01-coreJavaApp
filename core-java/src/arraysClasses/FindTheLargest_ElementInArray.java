package arraysClasses;

public class FindTheLargest_ElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize array
		int []ar= {20,40,50,80,90,70,100};
		//now find out the largest one  of element
		 int max=ar[0];
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			    if(ar[i]>max)
			    	max=ar[i];
		}
		System.out.println("The largest array element is :"+max);

	}

}
