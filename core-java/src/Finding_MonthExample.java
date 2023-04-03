import java.util.Scanner;

public class Finding_MonthExample {

	public static void main(String[] args) {
	    Scanner month= new Scanner(System.in);
	    System.out.println("pls enter the month number:  ");
	     int value=month.nextInt();
	     //for storing months declare string variable out side of the loop becz of everyone can access
	     String name="";
	       //switch loop for operation
	     switch(value) {
	     case 1:
	    	 name="january";
	    	 break;
	     case 2:
	    	 name="frebruary";
	    	 break;
	     case 3:
	    	 name="march";
	    	 break;
	     case 4:
	    	 name="april";
	    	 break;
	     case 5:
	    	 name="may";
	    	 break;
	     case 6:
	    	 name="june";
	    	 break;
	     case 7:
	    	 name="july";
	    	 break;
	     case 8:
	    	 name="august";
	     case 9:
	    	 name="spetember";
	     case 10:
	    	 name="october";
	    	 break;
	     case 11:
	    	 name="november";
	    	 break;
	     case 12:
	    	 name="december";
	    	 break;
	    	 default:
	    		 System.out.println("invalid month entered");
	    	 
	     }
	     System.out.println(name);
	    

	}

}
