package interview.strings;

public class GarbageStringliterals {
                  public static void main (String[]args) {
                	     String s1="a";
                	   //   System.out.println(s1.hashCode());
                	     System.out.println(System.identityHashCode(s1));
                	     //now im unrefernced the s1 object
                           s1=null;
                	     System.gc();
                	     try {
                	    	    Thread.sleep(2000);
                	    	    
                	     }catch(InterruptedException e) {
                	    	 
                	     }
                	     String s2="a";
                	    System.out.println(System.identityHashCode(s2));
                	     
                  }
                    
}
