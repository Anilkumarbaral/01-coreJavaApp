package co.multithreading;

public class DemonThredDemo {

	public static void main(String[] args) {
		   Mythread2 t=new Mythread2();
		//    t.setDaemon(true);
		    t.start();
		   System.out.println("end of main thread");
	}

}
