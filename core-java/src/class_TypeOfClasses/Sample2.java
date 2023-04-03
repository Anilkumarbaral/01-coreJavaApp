package class_TypeOfClasses;

public class Sample2 extends Example2{
                 Sample2(){
                	 System.out.println("sample2 no args constructor");
                 }
                 Sample2(int b){
                	 super(39);
                	 
                	 System.out.println("sample2 arg constructor");
                 }
	public static void main(String[] args) {
		              Sample2 s= new Sample2();
		              Sample2 s1 = new Sample2(10);
	}

}
