package arraysClasses;

public class JoggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int []a1= {1,2,3,4,5};
		  int[]a2= {6,7,8,9,10};
		  int[]a3= {11,12,13,14,15};
		  //now jogged array create
		  int [][]ai= {a1,a2,a3};
		  
		  for(int i=0;i<ai.length;i++){//outer for loop
			    for(int j=0;j<ai[i].length;j++) {
			    	System.out.println(ai[i][j]+" ");
			    }
			    System.out.println("\n");
			  
		  }

	}

}
