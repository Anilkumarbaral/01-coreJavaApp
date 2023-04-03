package practiceOfmultithreading;

public class Test2 {
            public static void main(String []args) {
            	 System.out.println(Thread.currentThread().getPriority());
            	 System.out.println();
            	 Thread.currentThread().setPriority(7);
            	 System.out.println(Thread.currentThread().getPriority());
            	 System.out.println();
            	 Mythread2 t=new Mythread2();
            	 System.out.println();
            	 System.out.println(t.getPriority());
            }
}
