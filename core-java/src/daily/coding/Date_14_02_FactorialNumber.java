package daily.coding;

public class Date_14_02_FactorialNumber {

	public static void main(String[] args) {
		// factoria number means 5=5*4*3*2*1=120
		
		int factoria=1;
		int factorialNumber=5;
		
		for(int i=1;i<=factorialNumber;i++) { //1*5=5
			                                                               //5*2=10
			                                                              //10*3=30
			                                                              //30*4=120
			      factoria=factoria*i;
		}
      System.out.println("5 factorial is :"+factoria);
	}

}
