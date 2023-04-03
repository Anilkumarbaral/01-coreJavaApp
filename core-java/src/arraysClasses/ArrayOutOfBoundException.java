package arraysClasses;

import java.util.Arrays;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []ai= {2,20,30,40};
		 System.out.println(ai);
		 System.out.println(Arrays.toString(ai));
		 for(int i=0;i<=ai.length;i++) {
			 System.out.println(ai[i]);
		 }

	}

}
