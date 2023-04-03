package interview.strings;

public class UsingContent_Method {

	public static void main(String[] args) {
	  String name="Anil kumar baral from odisha";
	   
	   //im using contains methods seraching string as sub string in current string 
	  
	             
	                       boolean check=name.contains("baral");//true
	                       System.out.println(check);
	                       System.out.println();
	                       //im checking here a single character lets
	                       System.out.println(name.contains("a"));//true
	                       System.out.println(name.contains("bral"));//false

	}

}
