package collection.corejava;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
	      ArrayList<String>alSort=new ArrayList<>();
	      
	      //adding the element to arraylist
	      alSort.add("India");
	      alSort.add("UK");
	      alSort.add("Canada");
	      alSort.add("France");
	      alSort.add("USA");
	      
	      System.out.println("after adding elemetn without sorting");
	   //   System.out.println(alSort.toString());
	      for(String s:alSort) {
	    	  System.out.println(s);
	    	 
	      }
	      System.out.println(alSort);
	      
	      Collections.sort(alSort);
	      System.out.println("afer sorting the element");
	      System.out.println(alSort);
	      
	      
	  }
}
