package new8features;

import java.util.ArrayList;

public class LambdaExpression_forEachloop {

	public static void main(String[] args) {
		  
		        ArrayList<String>name=new ArrayList<>();
		         name.add("anil");
		         name.add("suni");
		         name.add("ladu");
		         name.add("ayush");
		         
		         // i am using lambda expression for iterating java 8 new features
		         name.forEach((n)->System.out.print(" "+n));
		    
		
	}

}
