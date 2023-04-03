package multithread;

public class MutlipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		AddThread add=new AddThread();
		add.start();
		SubThread sub=new SubThread();
		sub.start();
		
		System.out.println("main exited");

	}

}
