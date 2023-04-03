package co.multithreading;

public class ReentractDemoTrylock {

	public static void main(String[] args) {
		MythreadTrylock t1=new MythreadTrylock("First Thread");
		MythreadTrylock t2=new MythreadTrylock("Second Thread");
		            t1.start();
		            t2.start();
		

	}

}
