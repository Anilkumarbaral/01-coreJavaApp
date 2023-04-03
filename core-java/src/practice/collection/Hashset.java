package practice.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
             
    public static void store(Set s) {
  	             s.add("a");
  	             s.add("c");
  	             s.add("5");
  	             s.add("d");
  	       //      s.addAll("a","c","5","d");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      HashSet<Object>h=new HashSet<>();
		      LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		      TreeSet<Object>ts=new TreeSet<>();
		      
		      ///by calling above method as sending arguments
		        
		 store(h);
		 System.out.println(h);
		 System.out.println();
		 store(lhs);
		 System.out.println(lhs);
		 System.out.println();
		 store(ts);
		 System.out.println(ts);
		 

	}

}
