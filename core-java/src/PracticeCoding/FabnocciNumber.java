package PracticeCoding;

public class FabnocciNumber {

	public static void main(String[] args) {
		//the sum of two previous number is called fabnoccic number
		
		  //declaring 3 number
		int n1=0,n2=1,n3=0,count=10;
		
		System.out.println(n1+"      "+n2);
		
		for(int i=0;i<count;i++) {
			
			  n3=n1+n2;
			  System.out.print(n3+"     ");
			n1=n2;
			n2=n3;
		}
		
	}

}
