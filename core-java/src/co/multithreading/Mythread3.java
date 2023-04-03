package co.multithreading;

public class Mythread3 extends Thread {
                     Display2 d;
                     String name;
                     Mythread3(Display2 d,String name){
                    	      this.d=d;
                    	  this.name=name;
                     }
                     public void run() {
                    	     d.wish(name);
                     }
}
