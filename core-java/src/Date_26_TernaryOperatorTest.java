import java.util.Scanner;

public class Date_26_TernaryOperatorTest {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		         System.out.println("pls enter the mark: ");
		         float mark=scn.nextFloat();
		         
		         //im using ternary operator
		         
		         String result=(mark>40)?"pass":"fail";
		         System.out.println("you  "+result+"  the exam");
		         scn.close();

	}

}
