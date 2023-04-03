package practiceOfmultithreading;

public class Test4Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread4 t=new Mythread4();
		    t.start();
		    for(int i=0;i<10;i++) {
		    	System.out.println("main thread");
		    }

	}

}
