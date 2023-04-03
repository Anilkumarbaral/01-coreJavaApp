package Basic_classes;

public class Test_Variable2 {
          int x=20;
          
	   static void m1() {
		       int p=10;
		       System.out.println(p);
		       m2();
		       final  int a;
		       a=39;
	   }
	   
	private static void m2() {
		   int p=1;
		int q=p+10;
		   System.out.println(q);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println();
		System.out.println();
		final int z;
		z=39;
		System.out.println(z);
	//	z=z+3;

	}

}
