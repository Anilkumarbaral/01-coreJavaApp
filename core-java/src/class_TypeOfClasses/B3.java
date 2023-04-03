package class_TypeOfClasses;

public class B3 extends A3 {
              int y=20;
              {
            	    System.out.println("B NSB");
            	    System.out.println("x:"+x);
            	    System.out.println("y: "+y);
              }
              B3(){
            	  System.out.println("B3 constructor");
            	  y=6;
              }
	public static void main(String[] args) {
		      System.out.println("B main");
		      B3 b1=new B3();
		     System.out.println("x: "+b1.x);
		     System.out.println("y: "+b1.y);
	}

}
