package collection.corejava;

import java.util.HashSet;

public class HashSetIteratorbyUsingForloop {
//program for  how to iterate HashSet by using for loop
	public static void main(String[] args) {
		//declare the hashset
		HashSet<String>hsForLoop=new HashSet<>();
		//add the element to hashset
		  hsForLoop.add("Apple");
		 hsForLoop.add("Orange");
		 hsForLoop.add("Banana");
		 hsForLoop.add("Papaya");
		 hsForLoop.add("Mango");
		 //print the hashset elements
		 System.out.println("print the hashet element");
		 
		 for(String st:hsForLoop) {
			 System.out.println(st);
		 }
		 
	}

}
