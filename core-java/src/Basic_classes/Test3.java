package Basic_classes;

public class Test3 {
       static void m3(Object obj) {
    	   
    	   if(obj instanceof Example )
    	   {
    	      Example e= (Example)obj;
    	      e.m1(); 
       }
   
         else if(obj instanceof Sample) {
    	    Sample s= (Sample)obj;
    	    s.m1();
    	   s.m2();
         }
 }
       public static void main(String[]args) {
    	 //    Test3.m3(new Sample());
    	    // Test3.m3(new Example());
    	     Test3.m3(new Object());
       }
}
