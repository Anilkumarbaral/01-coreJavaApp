import java.util.Scanner;

public class FabniccoNumberTest {

	public static void main(String[] args) {
		
	//i want to take 3 variables
		int num1=0,num2=1,n3;
		System.out.println("pls enter ur fabnicco number: ");
		System.out.println(num1+" "+num2);
		Scanner scn=new Scanner (System.in);
		int count=scn.nextInt();
		
     for(int i=2;i<count;i++) {
    	 n3=num1+num2;
    	 System.out.println(" "+n3);
    	 num1=num2;
    	 num2=n3;
     }

	}

}
