package multithread;

public class MythreadTest12 {

	public static void main(String[] args) {
	           Mythread12 t= new Mythread12();
	           t.start();
	           t.interrupt();
	           System.out.println("End of the main method");

	}

}
