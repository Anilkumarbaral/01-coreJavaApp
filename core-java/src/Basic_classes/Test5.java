package Basic_classes;

public class Test5 {

	public static void main(String[] args) {
		int a =50;
		int b=50;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a=b);
	//	System.out.println(a=b==b);
		System.out.println((a=b)==b);
		System.out.println();
		
		System.out.println(10==10.0);// int value promoted to double
		
		System.out.println();
		
		
		System.out.println(3.0f==3.0);
		System.out.println(3.5f==3.5);
		System.out.println();
		System.out.println(3.3f==3.3);
		System.out.println(6.6f==6.6);
		System.out.println(6.5f==6.5);
		
		System.out.println();
		Integer io1=10;
		Integer io2=10;
		Integer io3=io1+io2;
		System.out.println(io3);
		
	}

}
