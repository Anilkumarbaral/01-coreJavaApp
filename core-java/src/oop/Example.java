package oop;

public class Example {
          private int a;
          
          public void setA(int a) {
        	  if(a>0) {
        	     this.a=a;
        	  }
        	  else {
        		  System.out.println("pls enter correct value");
        	  }
          }
          public int getA() {
        	     return a;
          }
}
