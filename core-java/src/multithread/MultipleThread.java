package multithread;

public class MultipleThread extends Thread {
         public void run() {
        	   for(int i=0;i<50;i++) {
        		         System.out.println("i: "+i);
        	   }
         }
	public static void main(String[] args) {
	
               MultipleThread mt=new MultipleThread();
                          mt.start();
                         for(int i=0;i<50;i++) {
                        	 System.out.println("main :"+i);
                         }
	}

}
