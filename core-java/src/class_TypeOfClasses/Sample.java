package class_TypeOfClasses;

public class Sample extends Example {

	         static int b=m3();
	         static {
	        	 System.out.println("this is sample static block");
	         }
	         int y=m4();
	         {
	        	 System.out.println("this is sample non static block");
	         }
	         Sample(){
	        	 System.out.println("this is sample constructor");
	         }
	         static int m3() {
	        	 System.out.println("this is sample m3 static method");
	        	 return 30;
	         }
	         int m4() {
	        	 System.out.println("this is sample non static m4 method");
	        	 return 40;
	         }
	         void bbc() {
	        	 System.out.println("this is sample bbc method");
	         }
	
	public static void main(String[] args) {
		          System.out.println("sample main");
		          Sample s=new Sample();
		          s.abc();
		          s.bbc();
	}

}
