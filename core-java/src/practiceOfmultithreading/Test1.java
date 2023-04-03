package practiceOfmultithreading;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread1 t=new Mythread1();
		t.start();
		System.out.println("main thread "+Thread.currentThread().getName());
		

	}

}
