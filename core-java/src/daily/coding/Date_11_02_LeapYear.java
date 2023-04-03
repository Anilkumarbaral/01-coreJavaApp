package daily.coding;

public class Date_11_02_LeapYear {

	public static void main(String[] args) {
		
		
		// find out leap year
		
		   //a year is leap year if its divisible by 4 and400 not 100 
		
		int year=2023;
		
		if(year%4 ==0 && year %100 !=0 || year%400==0) {
			System.out.println(year+"   This year is Leap year");
		}
		else {
			System.out.println("this is not leap year");
		}
		
	}

}
