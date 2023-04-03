import java.util.Scanner;

public class FabonacciNumber2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("pls enter number : ");
		           int value=scn.nextInt();
		           int n1=0,n2=1,i,n3;
		           for( i=2;i<value;i++) {
		        	   n3=n1+n2;
		        	   System.out.println(" "+n3);
		        	   n1=n2;
		        	   n2=n3;
		           }

	}

}
