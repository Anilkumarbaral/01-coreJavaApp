package collection.corejava;

import java.util.ArrayList;

public class ArrayelementContainExample {

	public static void main(String[] args) {
		//declare the arraylist
		 ArrayList<Integer>al=new ArrayList<>();
		 //add element to arraylist
		 al.add(11);
		 al.add(22);
		 al.add(10);
		 al.add(7);
		 al.add(8);
		 
		 System.out.println("check the element exit or not");
		if(al.contains(0)) {
			      System.out.println("this element available");
		}
		else {
			 System.out.println("this element is not available");
		}
		 
   
	}

}

