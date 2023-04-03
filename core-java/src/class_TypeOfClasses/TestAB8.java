package class_TypeOfClasses;

public class TestAB8 {

	public static void main(String[] args) {
		     A8 a1=new A8();
		     B8 b1= new B8();
		     System.out.println(b1.a+"...."+b1.x);
		     System.out.println(a1.a+"...."+a1.x);
		     System.out.println(B8.a+"....."+A8.a);
		     System.out.println();
		     B8.a=5;
		     a1.a=6;
		     B8.a=6;
		     
		     System.out.println(b1.a+" ...."+b1.x);
		     System.out.println(a1.a+"...."+a1.x);
		     System.out.println(B8.a+"...."+A8.a);
		     
		     
	}

}
