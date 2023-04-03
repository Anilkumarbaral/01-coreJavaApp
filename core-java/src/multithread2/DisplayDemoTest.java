package multithread2;

public class DisplayDemoTest {

	public static void main(String[] args) {

		   Display d=new Display();
		   Mythread t1=new Mythread(d);
		   Mythread2 t2=new Mythread2(d);
		   t1.start();
		   t2.start();

	}

}
