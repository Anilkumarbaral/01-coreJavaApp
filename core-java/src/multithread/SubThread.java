package multithread;

public class SubThread extends Thread{
	int diff=0;
	          public void run() {
	        	    for(int i=0;i<50;i++) {
	        	             diff -=i;
	        	             System.out.println("The subtraction: "+diff);
	        	    }
	          }
	

}
