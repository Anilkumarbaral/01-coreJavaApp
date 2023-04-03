package co.multithreading;

public class TestGroupThread {

	public static void main(String[] args) {
	         ThreadGroup th=new ThreadGroup("first group");
	         System.out.println(th.getParent());
	         ThreadGroup th2=new ThreadGroup(th,"secondgroup");
	         System.out.println(th2.getParent());

	}

}
