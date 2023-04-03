package multithread;

public class MyrunnbaleDemo {

	public static void main(String[] args) {
		     Myrunnable r=new Myrunnable();
		     Thread t=new Thread(r);
		     t.start();
		     for(int i=0;i<10;i++) {
		    	 System.out.println("mainThread");
		     }

	}

}
