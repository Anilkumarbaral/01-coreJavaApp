package collection.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetAdd_All {

	public static void main(String[] args) {
	   
		
		     List<Integer>numberdivisibleby5=new ArrayList<>();
		       numberdivisibleby5.add(5);
		       numberdivisibleby5.add(10);
		       numberdivisibleby5.add(15);
		       numberdivisibleby5.add(20);
		       numberdivisibleby5.add(25);
		       numberdivisibleby5.add(30);
		       
		       List<Integer>numberdivisibleby3=new ArrayList<>();
		       numberdivisibleby3.add(3);
		       numberdivisibleby3.add(9);
		       numberdivisibleby3.add( 12);
		       numberdivisibleby3.add(15);
		       numberdivisibleby3.add(18);
		       numberdivisibleby3.add(21);
		       numberdivisibleby3.add(24);
		       
		       
		       // i store the all collection element in set for removing duplicates
		       
		       Set<Integer>numberdivisibleby5Or3=new HashSet<>(numberdivisibleby5);
		       numberdivisibleby5Or3.addAll(numberdivisibleby3);
		       
		       // i want to display all elements in hashset
		       Iterator i=numberdivisibleby5Or3.iterator();
		       while(i.hasNext()) {
		    	   System.out.println(i.next()+"  ");
		       }
		       
		       System.out.println(numberdivisibleby5Or3);
	}   

}
