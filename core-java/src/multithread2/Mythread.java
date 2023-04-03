package multithread2;

public class Mythread extends Thread {
            Display d;
            public Mythread(Display d) {
            	  this.d=d;
            	  
            }
            public void run() {
            	  d.displayan();
            }
}
