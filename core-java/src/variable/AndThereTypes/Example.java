package variable.AndThereTypes;

public class Example {
           static int a=m1();
        public static int m1() {
        	   System.out.println("this is m1 method");
        	     return 10;        	 
        }
        public static int m2() {
        	     System.out.println("this is m2 method");
        	     return 20;
        }
        public static void main(String[]args) {
        	     System.out.println("main");
        	     System.out.println(a);
        	     System.out.println(b);
        }
        static int b=m2();
}
