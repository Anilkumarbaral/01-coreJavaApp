package Test.Testregex;
import java.util.regex.*;
public class TestRegex_Alphanumeric {

	public static void main(String[] args) {
		   //only allow to character and numeric
		//character length should be 6 not more than
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "anilr1"));//it should be 6 letter
		System.out.println(Pattern.matches("[a-zA-Z0-9]{9}", "welco8sd"));//it should be 9 letter
		
	}

}
