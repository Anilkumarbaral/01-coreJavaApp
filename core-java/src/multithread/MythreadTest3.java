package multithread;

public class MythreadTest3 {

	public static void main(String[] args) {
		          System.out.println(Thread.currentThread().getName());
	                       Mythread5 t=new Mythread5();
	                             System.out.println(t.getName());
	                             Thread.currentThread().setName("anil");
	                             System.out.println(Thread.currentThread().getName());
	                             t.setName("baral");
	                             System.out.println(t.getName());
	                             
	                 //      t.start();
	                   //    System.out.println("main method");

	}

}
