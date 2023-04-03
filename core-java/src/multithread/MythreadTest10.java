package multithread;

public class MythreadTest10 {

	public static void main(String[] args) throws InterruptedException {
		          Mythread10.mt=Thread.currentThread();
		          Mythread10 t=new Mythread10();
		          t.start();
		          for(int i=0;i<10;i++) {
		        	  System.out.println("mainThread");
		        	  Thread.sleep(200);
		        	  
		          }
	}

}
