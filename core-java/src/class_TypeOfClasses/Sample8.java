package class_TypeOfClasses;

public class Sample8 extends Example8 {
                void add(int a,int b) {
                	   System.out.println("add(int a,int b)in sample: ");
                	   System.out.println("The addition of"+a+"and "+b+"is: "+(a+b));
                }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample8 s=new Sample8();
		s.add(10, 20);
		s.sub(10,20);
		

	}

}
