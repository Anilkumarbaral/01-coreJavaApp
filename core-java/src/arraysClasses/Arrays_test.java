package arraysClasses;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class Arrays_test {
            public static void main(String []args) {
            	 int []ai=new int[3];//one type of array
            	    //when  we know only the type of values and number of values to store we
            	 // dont know the actual values to store
            	 //those values are coming into program at runtime, means program execution
            	 ai[0]=1;
            	 ai[1]=3;
            	 ai[2]=10;
            	 System.out.println(ai[0]);
            	 System.out.println(ai[2]);
            	 System.out.println(ai);
            	
            	 int []ai2={1,3,4,5,7,9,0,29,22};//second type of array
            	 // we know the type of value and the number of values to store also know the actual value
            	 //to store at development time itself
            	 System.out.println();
            	 System.out.println("second approach when we know type of value and size and also know actual value:");
            	 System.out.println(ai2[0]);
            	 System.out.println(ai2[3]);
            	 System.out.println();
            	 
            	 int []ai3=new int[] {33,22,11,12};//type of three approaches
            	 //when we need to create an arrya object with values without variable 
            	 //either for passing it as an argument to a method or to a constructor of for returning form a method
            	 
            	 boolean[] boa=new boolean[3];
            	 boa[0]=true;
            	 boa[2]=false;
            	 System.out.println(boa);
            	 System.out.println(boa[2]);
            	 int[]ar=new int[(int) 10.343];
            	 
            	 System.out.println();
            	 System.out.println();
            	 System.out.println();
            	 System.out.println();
            	 int[]ar2=new int[-3];//NASE
          //  	 int[]ar12=new int["a"];
            	 int []arrr=new int['c'];
            	 
            	 
            	 
            	 System.out.println();
//            	 int [5]i;
//            	 []int i;
            	 
            	 //multidimension array declaration
            	 int[][]i;
            	 int [] []i2;
            	 int[]i3[];
            	 int[]air=new int[0];
            	 int[]i5=new int[(int) 10L];
            	 int[]i53=new int[(int) 10.09];
            	 
            	 
            }
}
