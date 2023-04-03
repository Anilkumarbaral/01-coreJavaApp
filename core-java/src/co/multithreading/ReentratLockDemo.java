package co.multithreading;

public class ReentratLockDemo {

	public static void main(String[] args) {
		     Display2 ds=new Display2();
		     Mythread3 t1=new Mythread3(ds,"Anil");
		     Mythread3 t2=new Mythread3(ds,"sundarpachai");
		     Mythread3 t3=new Mythread3(ds,"ElonMusk");
		     t1.start();
		     t2.start();
		     t3.start();
		     

	}

}
