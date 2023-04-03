package class_TypeOfClasses;

public class MOL3 {
                  static void m1(int a) {
                	  System.out.println("int arg");
                  }
                  static void m1(float f) {
                	  System.out.println("float arg");
                  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		           m1(10);
		           m1('a');
		           m1(50L);
		           long L=50;
		           m1(L);
		          // double d=50.4;
		         //  m1(59.37);
		         //  m1((float)d);

	}

}
