package class_TypeOfClasses;

public class Example {
               static int a=m1();
                  static {
                	      System.out.println("Example static block");
                  }
                  int b=m2();
                  {
                	  System.out.println("Example non static block");
                  }
                  Example(){
                	  System.out.println("Example Constructor");
                  }
                  static int m1() {
                	  System.out.println("this is static m1 method");
                	  return 10;
                  }
                	  
                  
                  int m2() {
                	  System.out.println("Example m2 method");
                	  return 20;
                  }
                  
                  void abc() {
                	  System.out.println("Example abc");
                  }
                  void bbc() {
                	  System.out.println("Example bbc");
                  }
}
