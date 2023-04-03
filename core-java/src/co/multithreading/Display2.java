package co.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Display2 {
                   ReentrantLock l1=new ReentrantLock();
                   //now creating one method
                   public void wish(String name) {
                	//   l1.lock();//locked--------line 1
                	   for(int i=0;i<10;i++) {
                		     System.out.println("Good morning");
                		     try {
                		    	   Thread.sleep(2000);
                		     }catch(InterruptedException e) {
                		    	    e.printStackTrace();
                		     }
                		     System.out.println(name);
                	   }// for
            //    	   l1.unlock();//-------- line 2
                   }
}
