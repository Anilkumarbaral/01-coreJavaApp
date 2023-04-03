package multithread;

public class MythreadTest6 {

	public static void main(String[] args) {
		               System.out.println(Thread.currentThread().getPriority());
		               
		       //        Thread.currentThread().setPriority(11); // more than 10 not allowed it priority value should be 1 to10
		                     Thread.currentThread().setPriority(8);
	                        Mythread6  t = new Mythread6();
	                             t.setPriority(9);
	                              System.out.println(Thread.currentThread().getPriority());
	                              System.out.println(t.getPriority());
	                        //        System.out.println("main thread executing name: "+Thread.currentThread().getName());

	}

}
