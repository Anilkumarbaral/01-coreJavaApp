package daily.coding;

public class fabnocciNumber {

	public static void main(String[] args) {
		//fabnocii number means the two previous number sum is next number 
		//like 0+1 +2=3 2+3=5
		
		  int n1=0,n2=1,n3;
		  
		  int number =10;
		  System.out.println("how many time u need to iterate::: ");
		  
		   for(int i=0;i<number;i++) {
			   
			      n3=n1+n2;
			      System.out.print(" "+n3);
			      n1=n2;
			      n2=n3;
		   }

	}

}
