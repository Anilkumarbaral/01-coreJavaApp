package Basic_classes;



public class Constructro_chaining{


	      Constructro_chaining(){
	    	  //this is default constructor
	    	  System.out.println("this is the default constructor");
	      }

	      Constructro_chaining(int x){

	    	   this();
	    	   System.out.println(x);
	      }
	      Constructro_chaining(int x, int y){

	    	     this(5);
	    	     System.out.println(x*y);

	      }
	      public static void main(String[] args) {
	       new Constructro_chaining(8,10);

		}
}