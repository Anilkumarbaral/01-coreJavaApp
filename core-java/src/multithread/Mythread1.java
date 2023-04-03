package multithread;

public class Mythread1 extends Thread {
          public void run() {
        	  System.out.println("no args run");
          }
          public void run(int i) {
        	  System.out.println("args run");
          }
          
}
