package multithread;

public class CustomThreadbyusingRunnable implements Runnable{ 

	    public void run() {
	    	 System.out.println("run");
	    }
	public static void main(String[] args) {
		System.out.println("main");
		     CustomMultithreadbyThread mth=new CustomMultithreadbyThread();
		            Thread th=new Thread(mth);
		            th.start();

	}

}
