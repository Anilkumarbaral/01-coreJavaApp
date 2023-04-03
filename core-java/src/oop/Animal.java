package oop;

public interface Animal {
           public void eat();
           public void sleep();
           //we can create inside interface  1
           //publi static final variable           2
           //public static implements methods  3
           //public default implements methods  4
           //public abstract methdos   5
           //public static inner class     6
           
           //now i am mentioning those are not allowed create inside interface
           // 1 instance variable // non static variable
           //2 non static method
           //3 static /non static block are not allowed
           // 4 constructor is not allowed inside interface
//           public static final int a;
//           public static void m1();
}
