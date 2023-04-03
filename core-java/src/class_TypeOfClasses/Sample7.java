package class_TypeOfClasses;

public class Sample7 extends Example7{
          void add(int x , int y) {
        	  System.out.println("Sample int, int");
          }
          float add(float a, int b) {
        	  System.out.println("Sample float, int");
        	  return a+b;
          }
          String add(String s1,double d) {
        	  System.out.println("sample string,double");
        	  return s1+d;
          }
}
