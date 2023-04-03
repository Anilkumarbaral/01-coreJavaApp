package multithread;

public class MythreadTest7 {

	public static void main(String[] args) {
	                  Mythread7 t= new Mythread7();
	                     t.setPriority(7);
	                     System.out.println(t.getPriority());
	                     System.out.println(Thread.currentThread().getPriority());
	                     t.start();
	                     for(int i=0;i<10;i++) {
	                    	 System.out.println("main thread");
	                     }

	}

}
