package class_TypeOfClasses;

public class PageNO_44_MethodOverloading {
                void m1(int a) {
                	System.out.println("int-args");
                }
                void m1(char ch) {
                	        System.out.println("Char-args");
                }
                public static void main(String []args) {
                	PageNO_44_MethodOverloading a1=new PageNO_44_MethodOverloading();
                	
                	a1.m1(99);
                	a1.m1('c');
                	a1.m1((char)100);
                	a1.m1((int)'d');
                	
                	
                	System.out.println();
                	int i1=97;
                	int i2='a';
                	char ch=98;
                	char ch2='b';
                	
                	a1.m1(i1);
                	a1.m1(i2);
                	a1.m1(ch);
                	a1.m1(ch2);
                	System.out.println();
                	
                	a1.m1((char)i1);
                	a1.m1((int)ch);
                	System.out.println();
                	a1.m1(i1+i2);
                	a1.m1(ch+ch2);
                	
                	System.out.println();
                	a1.m1(10+'a');
                	a1.m1('a'+'b');
                	a1.m1((char)('a'+'b'));
                	a1.m1((char)'a'+'b');
                	System.out.println();
                	
                	a1.m1(m2());
                	a1.m1(m3());
                	
                }
              static int m2() {
            	  return 'a';
              }  
              static char m3() {
            	  return 97;
              }  
}
