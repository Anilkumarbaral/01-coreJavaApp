import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		  Scanner reader= new Scanner(System.in);
		  System.out.println("enter two values");
		  
		  double first=reader.nextDouble();
		  double second=reader.nextDouble();
		  System.out.println("enter the Operator(+,-,*,/)");
		  char operator=reader.next().charAt(0);
		  double result;
		  
		  switch(operator) {
		  case '+':
			  result=first+second;
			  break;
		  case '-':
			  result=first-second;
			  break;
		  case '*':
			  result =first*second;
			  break;
		  case '/':
			  result=first/second;
			  break;
			  //if operator does not match in case then display error message 
			  default :
			  System.out.println("Error passed operator does not matched try again ");
			  return;
		  }
		  //print the result operation
		  System.out.printf("%.1f %c %.1f = %.1f",first,operator,second,result);
	}

}
