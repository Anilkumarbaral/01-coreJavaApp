package multithread;

public class Mythread8  extends Thread{
            public void run() {
            	  for(int i=0;i<10;i++) {
            		  System.out.println("child Thread");
            		    Thread.yield();
            	  }
            }
}
