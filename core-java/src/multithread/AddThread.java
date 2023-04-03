package multithread;

public class AddThread extends Thread {
               int sum=0;
               public void run() {
            	     for(int i=0;i<50;i++) {
            	    	          sum +=i;
            	    	 System.out.println("The summation: "+sum);
            	     }
               }


}
