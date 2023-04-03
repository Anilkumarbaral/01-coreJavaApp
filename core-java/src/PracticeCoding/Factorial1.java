package PracticeCoding;

public class Factorial1 {
    //factorial means
	//  5 facotrrial=5*4*3*2*1=

	
	public static void main(String[] args) {
		int number=5;
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
	}
	

}
