package variable.AndThereTypes;

public class Example2 {
            static int a=10;
	public static void main(String[] args) {
		        //here im defining a local variable with same class level variable is variable shadowing
		         int a=50;
		         a=a;
		         System.out.println(a);
		         Example2.a=a;
		         System.out.println(a);
		         System.out.println(Example2.a);
	}

}
