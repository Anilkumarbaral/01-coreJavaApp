package practiceOfmultithreading;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread3 t=new Mythread3();
		        //     t.setPriority(10);
		             t.start();
		             for(int i=0;i<10;i++) {
		            	 System.out.println("main thread");
		             }

	}

}
