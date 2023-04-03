package exceptionPractice;

public class ExcplicitlyThrowException {

	public static void main(String[] args) {
		 System.out.println("Hiii Anil..");
		          NullPointerException nullexception =new NullPointerException();
		          throw nullexception;
		      //    System.out.println("welcome to java"); showing unreachable code 
		          //due to throwing exception after thrwoing exception it will be unreachble code
	}

}
