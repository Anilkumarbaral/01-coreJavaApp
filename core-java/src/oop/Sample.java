package oop;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example e=new Example();
     //   e.a=30; field is not visible
          e.setA(30);
          System.out.println(e.getA());
          
          System.out.println();
          e.setA(-50);
          System.out.println(e.getA());
        
	}

}
