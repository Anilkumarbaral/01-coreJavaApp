package co.multithreading;

public class Mythread2  extends Thread {
       public void run() {
    	   for(int i=0;i<10;i++) {
    		      System.out.println("child thread");
    		      try {
    		    	  Thread.sleep(200);
    		      }catch(InterruptedException e){
    		    	  e.printStackTrace();
    		      }
    	   }
       }
}
