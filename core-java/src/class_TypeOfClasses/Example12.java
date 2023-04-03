package class_TypeOfClasses;

public class Example12 {

	
	  static int a=m1();
	  static {
		  System.out.println("Example sb");	  
	  }
	  int x=m2();
	  {
		  System.out.println("Example NSB");
	  }
	  Example12(){
		     System.out.println("Example Constructor");
	  }
    static int m1() {
		System.out.println("Example static variable is created");
		return 10;
	}
	  int m2() {
		System.out.println("Example non static variable is created");
		return 20;
	}
	  void abc() {
		  System.out.println("Example abc");
	  }
	  void bbc() {
		  System.out.println("Example bbc");
	  }
	  
}
