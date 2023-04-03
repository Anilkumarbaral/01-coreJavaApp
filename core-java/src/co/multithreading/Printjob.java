package co.multithreading;
import java.util.concurrent.*;
public class Printjob implements Runnable {
               String name;
               Printjob(String name){
            	     this.name=name;
               }
               public void run() {
            	      System.out.println(name+"job started by thread: "+Thread.currentThread().getName());
            	      try {
            	    	     Thread.sleep(2000);
            	      }catch(InterruptedException e) {}
            	      System.out.println(name+"job complted by thread: "+Thread.currentThread().getName());
               }
}
