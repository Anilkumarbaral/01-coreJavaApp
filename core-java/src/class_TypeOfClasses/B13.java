package class_TypeOfClasses;

public class B13 extends A13 {
                 void m1() {
                	 System.out.println(" B m1");
                 }
	public static void main(String[] args) {
		      B13 b1=new B13();
		      b1.m1();
		      System.out.println();
		      b1.m2();
		      System.out.println();
		      A13 a1 = new B13();
		    //  a1.m1();
		      a1.m2();

	}

}
