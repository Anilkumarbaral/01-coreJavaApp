package collection.corejava;

import java.util.HashSet;
import java.util.Iterator;

//1. Program for How to Iterate HashSet  Using Iterator

public class HashSetIteratorExample {

	public static void main(String[] args) {
	// declare hashset
		  HashSet<String>hs=new HashSet<>();
		  
		  //then add element into hashset
		  hs.add("apple");
		  hs.add("banana");
		  hs.add("mango");
		  hs.add("papaya");
		  hs.add("orange");
		  //we have to call iterator
		 Iterator<String>it=hs.iterator();
		 //printing the elements
		 System.out.println("printing the hashset element");
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
