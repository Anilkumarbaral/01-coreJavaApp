package collection.corejava;

import java.util.ArrayList;

public class ArrayList_diplayingUppercase {

	public static void main(String[] args) {
		   ArrayList<String>al=new ArrayList<>();

		      al.add("a");
		      al.add("b");
		      al.add("c");
		      //display the element
		      System.out.println(al);
		      //i want to diplay in uppercase
		      for (int i=0;i<al.size();i++) {
		    	      Object obj=al.get(i);// st1
		    	      String str=(String)obj;
		    	      System.out.println(str.toUpperCase());
		    	      
		      }
		      System.out.println();
		      System.out.println(al);
	}

	
}
