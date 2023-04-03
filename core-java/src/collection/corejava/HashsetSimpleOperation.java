package collection.corejava;

import java.util.HashSet;
import java.util.Set;

public class HashsetSimpleOperation {

	public static void main(String[] args) {
		/*
		 * Check if a HashSet is empty | isEmpty() 
		 * Find the number of elements in theHashSet | size() 
		 * Check if an element exists in the HashSet | contains()
		 */
		Set<String>popularcitySet=new HashSet<String>();
		
		 System.out.println(popularcitySet.isEmpty());
		 popularcitySet.add("NewYork");
		 popularcitySet.add("paris");
		 popularcitySet.add("Dubai");
		 popularcitySet.add("Goa");
		 
		 
		 //checking the size of hashset
		 
		System.out.println("popularcitySet   size: "+popularcitySet.size());
		//cheking if an element exist in the hashset or not
		
		String name="paris";
		
		if(popularcitySet.contains(name)) {
			System.out.println("yes popularcity paris is available  ");
		}
		else {
			System.out.println("popularcity paris is not available");
		}
	}

}
