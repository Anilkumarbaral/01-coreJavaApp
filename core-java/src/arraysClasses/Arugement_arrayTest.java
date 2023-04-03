package arraysClasses;

import java.util.Arrays;

public class Arugement_arrayTest {
	  static void m1(int[]ai) {
   	         ai[2]=5;//reinitialize
   	         System.out.println(Arrays.toString(ai));
      }
	public static void main(String[] args) {
		   // int []i= {10,20,30,40};
		         int []i= {1,2};
		    m1(i);
		    System.out.println();
		    for(int i2:i) {
		    	  System.out.print(i2+" ");
		    }
		    		

	}

}
