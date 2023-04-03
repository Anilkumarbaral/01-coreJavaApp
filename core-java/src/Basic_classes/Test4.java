package Basic_classes;

public class Test4 {
     int i1=10;
     float f1=20;
     
      float f2=i1+f1;
      int i2=(int) (i1+f1);
      int i3=i1+(int)f1;
  //    int i4=(int)i1+f1;
      
      byte b1=50;
      byte b2=100;
      byte b3=(byte)(b1+b2);
      
      float f=0;
      float f3=0;
      float f4=f/f3;
      float f5=10;
      
      
      
      public static void main(String[] args) {
    	  Test4 t=new Test4();
    	    System.out.println(t.f2);
    	    System.out.println(4*2+8/2-3*3+4/2);
    	    System.out.println(t.f4);
    	    System.out.println(t.f5/0);
    	    System.out.println(10f/0);
      }
}
