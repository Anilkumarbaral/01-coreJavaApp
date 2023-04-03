package Test.Testregex;

import java.util.regex.*;

public class TestjavaRegex {

	public static void main(String[] args) {
		           // create regrex in 1st way
		
		        //step 1
		    Pattern p=Pattern.compile(".a");
		    //step-2
		    Matcher m=p.matcher("sa");
		    //step-3
		   boolean b= m.matches();
		   System.out.println(b);
		   
		   //2nd way
		   
		     boolean b2=Pattern.compile(".s").matcher("as").matches();
		     System.out.println(b2);
		     
		     ///3rd way
		     
		             boolean b3=Pattern.matches(".s", "as");
		             System.out.println(b3);

	}

	
}
