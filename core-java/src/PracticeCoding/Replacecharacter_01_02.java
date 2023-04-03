package PracticeCoding;

public class Replacecharacter_01_02 {

	public static void main(String[] args) {
		     //given string
		
		     String input="opentext";
		     //output: open1ex2;
		     char replacechar='t';
		     System.out.println("before replace  :"+input);
		     
		         //first checking the replace character is available or not
		     
		        if(input.indexOf(replacechar)==-1) {
		        	   System.out.println("replace character is not available ");
		        	  System.exit(0);
		        }
		        //if available then
		        int count=1;
		        for(int i=0;i<input.length();i++) {
		        	        char ch=  input.charAt(i);
		        	        if(replacechar==ch) {
		        	        	   input=input.replaceFirst(String.valueOf(replacechar), String.valueOf(count));
		        	        	   count++;
		        	        }
		        }//for
		        System.out.println("after replace : "+input);


	}

}
