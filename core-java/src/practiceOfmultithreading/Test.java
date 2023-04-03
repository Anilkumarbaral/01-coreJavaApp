package practiceOfmultithreading;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Mythread t=new Mythread();
	//	System.out.println(t.g);
		     Thread.currentThread().setName("anil kumar");
		     System.out.println(Thread.currentThread().getName());

	}

}
