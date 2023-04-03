package daily.coding;

public class Fabnoccic_number {

	public static void main(String[] args) {
      
		      //fabnocci number is two of previous number is call fabnocci number
		// for example 0+1 =2 1+2=3 like that
		
		
		        int n1=0,n2=1;
		         int n3=0;
		         int number=10;
		         
		         
		       for(int i=0;i<number;i++) {
		    	   
		    	  n3=n1+n2;
		    	  System.out.println(n3);
		    	  n1=n2;
		    	  n2=n3;
		    	   
		       }
		         
		         
		  
	}

}
