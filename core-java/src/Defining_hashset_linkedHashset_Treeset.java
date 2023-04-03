import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Defining_hashset_linkedHashset_Treeset {

	public static void main(String[] args) {
		
                 //im defining three set and displaying how they are storing elements
		
		                  HashSet<Object>hs=new HashSet<>();
		                  LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		               TreeSet<Object>ts=new TreeSet<>();
		                  // now im creating a mthod where i passed the value to in this objects
		                  store(hs);
		                  System.out.println(hs);//based on hashcode 
		                  store(lhs);
		                  System.out.println(lhs);//insertion ordered
		                  store(ts);
		                  System.out.println(ts);
	}
                   
	        public static void store(Set s) {
	        	       s.add("a");
	        	       s.add("k");
	        	       s.add("b");
	        	       s.add("4");
	        	       s.add("1");
        	       s.add("9");
	        	       s.add("0");
//	        	       s.add(9);
//	        	       s.add(3);
//	        	       s.add(7);
//	        	       s.add(1);
//	        	       s.add(3);
	        	       
	        	       
	        }
}
