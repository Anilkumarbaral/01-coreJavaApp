package multithread;

public class MythreadTest11 {

	public static void main(String[] args) {
		Mythread11 t= new Mythread11();
		         t.start();
		         t.interrupt();
		         System.out.println("end of the main thread");

	}

}
