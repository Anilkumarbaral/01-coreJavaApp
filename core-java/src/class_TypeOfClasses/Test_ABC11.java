package class_TypeOfClasses;

public class Test_ABC11 {
	static {
		System.out.println("ABC is loaded");
	}

	public static void main(String[] args) {
	             B11 b1=new B11();
	             C11 c1=new C11();
	              
	             b1.a=15;
	             b1.x=16;
	             
	             System.out.println("b.a"+b1.a);
	             System.out.println("c1.a: "+c1.a);
	             System.out.println();
	             System.out.println("b1.x: "+b1.x);
	             System.out.println("c1.x: "+c1.x);
	}

}
