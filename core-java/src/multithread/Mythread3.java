package multithread;

public class Mythread3 extends Thread {
 
	          int x;
	          Mythread3(){
	        	  this.x=x;
	          }
	          public void run() {
	        	  for(int i=0;i<this.x;i++) {
	        		  System.out.println(getName( ) +"run: "+i);
	        	  }
	          }
	


}
