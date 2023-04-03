package multithread;

public class Mythread12  extends Thread{
                               public void run() {
                            	                    for(int i=0;i<1000;i++) {
                            	                    	 System.out.println("i am lazy thread: "+i);
                            	                    }
                            	                    System.out.println("Im entering into sleeping state");
                            	                    try {
                            	                    	Thread.sleep(1000);
                            	                    }catch(InterruptedException e) {
                            	                    	System.out.println("i got interrupted");
                            	                    }
                               }
}
