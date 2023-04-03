package Test.Testregex;

import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		         // im using 3rd approach
		
		  
		
		          boolean b=Pattern.matches(".s", "mks");//falses
		          System.out.println(b);
		          boolean b1=Pattern.matches(".s", "ms");//true
		          System.out.println(b1);
		          boolean b2=Pattern.matches("..s", "mksf");//false
		          System.out.println(b2);
		          boolean b3=Pattern.matches("..s", "mks");//true
		          System.out.println(b3);
		          

	}

}
