package arraysClasses;

public class ArrayPassingArugment {

	public static void main(String[] args) {
//type one 
		int[]i=new int[5];
		  i[0]=1;
		  i[1]=2;
		  i[2]=3;
		  i[3]=4;
		  i[4]=5;
		 //2nd approach
		  int[]i2= {6,7,8,9,10};
            m1(i);
            System.out.println();
            m1(i2);
            //3rd approach
            m1(new int[]{11,12,13,14,15});

	}
	static void m1(int[]ai) {
		  System.out.println(ai.length+" the length of array");
		      System.out.println("printing the elements of array");
		      for(int i:ai) {//since 1.5 for each invented
		    	    System.out.print(i+" ");
		      }
	}

}
