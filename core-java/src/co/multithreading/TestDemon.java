package co.multithreading;

public class TestDemon {

	public static void main(String[] args) {
		 System.out.println(Thread.currentThread().isDaemon());
	//	 Thread.currentThread().setDaemon(true);
		 Mythread1 t=new Mythread1();
		                   System.out.println(t.isDaemon());
		                   t.setDaemon(true);
		                   System.out.println();
		                   System.out.println(t.isDaemon());
	
	}

}
