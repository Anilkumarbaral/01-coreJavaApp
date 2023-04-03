package arraysClasses;

import Basic_classes.Example;
import Basic_classes.Sample;
import Basic_classes.Test;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Object obj=new int[] {1,2,3};
		   int[]somarray=(int[])obj;
		   
		   for(int i:somarray) {
			      System.out.print(i+" ");
		   }
		   //
	//	   Object[]obj2=new Example();//mismatch incompatible
		   
		   Object[]obj3=new Example[5];
		   obj3[0]=new Example();
		   obj3[1]=new Sample();
		   obj3[2]=new Test();
		   
		   
	
		   

	}

}
