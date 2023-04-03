package Basic_classes;

public class RemoveSpaces {

	public static void main(String[] args) {
		    String s="   Hi anil welcome to java world u love coding   ";
		    System.out.println(s);
		    //removing spaces
		      //using trim only can remove first and last space
		    String s1=s.trim();
		    System.out.println(s1);
		    System.out.println();
		  String s2=  s.replaceAll(" ", "");
              System.out.println(s2);
	}

}
