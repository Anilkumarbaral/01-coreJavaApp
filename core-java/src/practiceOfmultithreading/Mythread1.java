package practiceOfmultithreading;

public class Mythread1 extends Thread {
              public void run() {
            	      System.out.println("run method executed: "+Thread.currentThread().getName());
              }
}
