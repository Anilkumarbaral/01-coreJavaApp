package co.multithreading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		  Display d=new Display();
		  Mythread t1=new Mythread(d,"Anil    ");
		  Mythread t2=new Mythread(d,"Sunil");
		 t1.start();
		 t2.start();
		 
		  

	}

}
