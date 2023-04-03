package exceptionPractice;

class InnerTryDemo {

	public static void main(String[] args) {
		   try {
			         System.out.println("in outer try");
			          try {
			        	    System.out.println("in inner try");
			        	    System.out.println(10/0);
			          }catch(ArithmeticException ae) {
			        	  System.out.println("in inner catch");
			          }
			       System.out.println("after inner try and catch");   
		   } catch(ArithmeticException ae) {
			   System.out.println("outer catch block");
		   }
		   System.out.println("after outer try and catch block");

	}

}
