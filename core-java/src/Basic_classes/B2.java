package Basic_classes;

public class B2 extends A2 {
	      static int b=20;
	      static {
	    	         System.out.println("in B static block");
	    	         System.out.println("a: "+a);
	    	         System.out.println("b: "+b);
	    	         System.out.println("b: "+getB());
	      }
	      static int getB() {
	    	  return b;
	      }

	public static void main(String[] args) {
		             System.out.println("in B main");
		             System.out.println("a: "+a);
		             System.out.println("b: "+b);
	}

}
