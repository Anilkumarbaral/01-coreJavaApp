package multithread;

public class MultiTherading  extends Thread{
	   public void run() {
		          for(int i=0;i<10;i++) {
		        	    System.out.println("child Thread");
		        	 //   System.out.println();
		          }
		          //System.out.println();
	   }

	public static void main(String[] args) {
		MultiTherading t=new MultiTherading();
		//t.start();
		t.run();
		System.out.println();
		for(int i=0;i<10;i++) {
			  System.out.println("main thread");
		}
		System.out.println();

	}

}
