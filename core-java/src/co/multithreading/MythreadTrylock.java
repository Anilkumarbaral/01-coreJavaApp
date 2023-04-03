package co.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class MythreadTrylock  extends Thread{
            static ReentrantLock l1=new ReentrantLock();
            MythreadTrylock(String name){
            	      super(name);
            }
            public void run() {
            	       if(l1.tryLock()) {
            	    	     System.out.println(Thread.currentThread().getName()+"got lock and prforming safe operation");
            	    	     try {
            	    	    	      Thread.sleep(1000);
            	    	     }catch(InterruptedException e) {
            	    	    	   e.printStackTrace();
            	    	     }
            	    	l1.unlock();     
            	    	    
            	       }// if
            	       else {
      	    	    	    System.out.println(Thread.currentThread().getName()+"unable to got lock and perform alternative operation");
      	    	     }
            }
}
