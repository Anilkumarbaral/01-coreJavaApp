package daily.coding;

public class Date_15_02_RightTrianglePattern {

	public static void main(String[] args) {
	   // i =row
		//j==column
	// row =6
		
		int i,j,row=6;
		
		for( i=0;i<row;i++) {
			  
			     for(j=0;j<=i;j++) {
			    	 //print star
			    	   System.out.print("*");
			     }
			     //throws the cursor in a  new line after printing each line
			     System.out.println();
		}

	}

}
