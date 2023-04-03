package multithread;

public class MythreadTest8 {

	public static void main(String[] args) {
		                Mythread8 t= new Mythread8();
		                t.start();
		                for(int i=0;i<10;i++) {
		                	System.out.println("main thread");
		                	
		                }

	}

}
