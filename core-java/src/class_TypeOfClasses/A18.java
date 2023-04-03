package class_TypeOfClasses;

public class A18 {
            void m1(Example e) {
            	System.out.println("Example arg");
            }
            void m1(Sample s) {
            	System.out.println("sample args");
            }
            public static void main(String[]args) {
            	A18 a=new A18();
            	a.m1(new Example());
            	a.m1(new Sample());
            //	a.m1("abc");
            	System.out.println();
            	a.m1(null);
            }
}
