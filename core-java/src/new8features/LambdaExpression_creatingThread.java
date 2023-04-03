package new8features;

public class LambdaExpression_creatingThread {

	public static void main(String[] args) {
		//creating thread without using lambda
		Runnable r=new Runnable() {
			 public void run() {
				   System.out.println("thread 1 is running ..");
			 }
		};
		   Thread t=new Thread(r);
		   t.start();
		     //using lambda
		   Runnable r2=()->{   System.out.println("thread2 is running..");};
		   Thread t2=new Thread(r2);
		   t2.start();

	}

}
