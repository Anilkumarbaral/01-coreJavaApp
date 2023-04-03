package class_TypeOfClasses;

public class Sample12 extends Example12 {

	static int b=m3();
	static {
		  System.out.println("sample sb");
	}
	int y=m4();
	{
		System.out.println("Sample NSB");
	}
	Sample12(){
		 System.out.println("Sample Constructor");
	}
	
	

	 static int m3() {
		System.out.println("Sample static variable is created");
		return 30;
	}
	   int m4() {
		System.out.println("Sample non static  varaible is created ");
		return 40;
	}
	void abc() {
		System.out.println("sample abc");
	}

	public static void main(String[] args) {
		 System.out.println("Sample main");
		 Sample12 s=new Sample12();
		  s.abc();
		  s.bbc();
	}

}
