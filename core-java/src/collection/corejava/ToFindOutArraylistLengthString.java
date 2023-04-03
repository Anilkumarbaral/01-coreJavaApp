package collection.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class ToFindOutArraylistLengthString {

	public static void main(String[] args) {
		
		//create Arraylist string object
		  ArrayList<String>cities=new ArrayList<String>();
		  //before add element arraylist size
		  System.out.println("before add element: "+cities);
		  //add element to the arraylist
		  cities.add("hyderbad");
		  cities.add("Bhubaneswar");
		  cities.add("Bangalore");
		  cities.add("kolkota");
		  //after adding the element to the arraysList
		  System.out.println("after addding element to arraylits   :"+cities.size());
		  System.out.println(cities.toString());
		  //removing some element from the arrauyl
		  cities.remove(1);
		  cities.remove(0);
		 int size=cities.size();
		 System.out.println(size);
		cities.clear();
		size=cities.size();
		System.out.println("after clearing all element size :"+size);
		
				
			  
	}

}
