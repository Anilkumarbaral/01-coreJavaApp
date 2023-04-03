package string;
import java.util.regex.*;
public class RemoveTheSpecialcharacter {

	public static void main(String[] args) {
	//create string
		String spch="anil!2@*hari%#@student1!";
		System.out.println("before :"+spch);
		//now removing the special character
		      String plainst= spch.replaceAll("[^a-zA-Z0-9]", "");
		         
               System.out.println("after"+plainst);
	}

}
