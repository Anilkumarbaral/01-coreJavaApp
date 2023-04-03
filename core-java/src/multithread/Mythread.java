package multithread;

public class Mythread extends Thread{
         public void run() {
        	            for(int i=0;i<30;i++) {
        	            	System.out.println("run :"+i);
        	            }
         }
	public static void main(String[] args) {
		            Mythread mt=new Mythread();
		            Mythread mt2=new Mythread();
		            Mythread mt3=new Mythread();
		            
		            mt.start();
		            mt2.start();
		            mt3.start();
		            //mt.start();
		                  //    mt.run();
//		                      for(int i=0;i<30;i++) {
//		                    	  System.out.println("main :"+i);
//		                      }

	}

}
