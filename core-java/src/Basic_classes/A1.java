package Basic_classes;

public class A1 {
    static void m1(A1 a) {
    	  System.out.println("m1");
    }
    static A1 m2(String s) {
    	System.out.println("m2");
    	  return new A1();
    }
    public static void main(String[]args) {
    	   A1 a=new A1();
    	   a.m1(a);
    }
}
