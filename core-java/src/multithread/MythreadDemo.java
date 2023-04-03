package multithread;

public class MythreadDemo extends Thread{

	public MythreadDemo(ThreadGroup g,String name) {
		            super(g,name);
	}
	public void run() {
		  System.out.println("childThread");
		    try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {}
	}

}
