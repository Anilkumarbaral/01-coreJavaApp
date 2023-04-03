package multithread;

public class MythreadTest9 {

	public static void main(String[] args) throws Exception {
		             Mythread9 t= new Mythread9();
		             t.start();
		             t.join();
		             for(int i=0;i<10;i++) {
		            	 System.out.println("RamThread");
		             }
	}

}
