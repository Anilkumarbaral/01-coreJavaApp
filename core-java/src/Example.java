
public class Example {
  void m1() {
	  System.out.println("method from m1");
	       m2();
  }
  void m2() {
	  System.out.println("method from m2");
  }
	public static void main(String[] args) {
	         Example e1 = new Example();
	         e1.m1();
	         
	}

}
