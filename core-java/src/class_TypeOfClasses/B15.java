package class_TypeOfClasses;

class B15 extends A15{
    void m1() {
  	  System.out.println("B m1");
    }
    void m3() {
  	  System.out.println("B m3");
  	  m1();
  	  super.m2();
    }
}