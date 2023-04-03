package multithread;

public class CustomMultithreadbyThread extends Thread{
	  public void run() {
		  System.out.println("run");
	  }

	public static void main(String[] args) {
		System.out.println("main");
		     
               CustomMultithreadbyThread th=new CustomMultithreadbyThread();
             th.start();
	}

}
