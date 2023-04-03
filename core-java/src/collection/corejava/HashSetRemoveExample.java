package collection.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemoveExample {

	public static void main(String[] args) {
		/*
		 * This example shows how to:
		 * 
		 * Remove an element from a HashSet. Remove all the elements that exist in a
		 * given collection from the HashSet. Remove all the elements that satisfy a
		 * given predicate from the HashSet. Clear the HashSet completely by removing
		 * all the elements.
		 */
		Set<Integer>number=new HashSet<>();
		
		 number.add(1);
		 number.add(2);
		 number.add(3);
		 number.add(4);
		 number.add(5);
		 number.add(6);
		 number.add(7);
		 number.add(8);
		 number.add(9);
		 number.add(10);
		 
		 System.out.println(number);
		 ///remove one elemnet
		 number.remove(10);
		 System.out.println(number);
		 List<Integer>removelement=new ArrayList<>();
		   removelement.add(4);
		   removelement.add(9);
		 number.removeAll(removelement);
		 System.out.println(number);
		 
		 number.removeIf(num->num%2==0);
		 System.out.println(number);
		 number.clear();
		 System.out.println(number);
	}

}
