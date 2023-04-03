package multithread;

public class MyThreadOverrideStartmethod extends Thread{
	public void run() {
		         System.out.println("run");
		         
	}

	public void start() {
		   System.out.println("start");
		   run();
		   super.start();
	}

	public static void main(String[] args) {
		
                   MyThreadOverrideStartmethod mt= new MyThreadOverrideStartmethod();
                           //    mt.run();
                               mt.start();
                               System.out.println("main");
	}

}
