package Test.Testregex;

import java.util.regex.Pattern;

public class TestRegex2 {

	public static void main(String[] args) {
	
		
		                 boolean b=Pattern.matches("[mno]", "adbcdo");
		                 System.out.println(b);
		                 boolean b1=Pattern.matches("[mno]", "n");
		                 System.out.println(b1);
		                 boolean b3=Pattern.matches("[mno]", "m");
		                 System.out.println(b3);
	} 

}
