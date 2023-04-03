package multithread2;

public class Display {
        public synchronized void displayan() {
        	   for(int i=0;i<10;i++) {
        		     System.out.println(i);
        		     try {
        		    	  Thread.sleep(2000);
        		     }catch(InterruptedException ie) {ie.printStackTrace();}
        	   }//for
        }//displayan method
        public synchronized void displayc() {
        	  for(int i=65;i<90;i++) {
        		   System.out.println((char)i);
        		   try { 
        			   Thread.sleep(2000);
        		   }catch(InterruptedException ie) {
        			   ie.printStackTrace();
        		   }
        	  }
        }
}
