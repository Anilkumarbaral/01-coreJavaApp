package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class TreeSet {

	public static void main(String[] args) {
	
		
		HashSet<String>h=new HashSet<>();
	//	TreeSet<String>ts=new TreeSet<>();
		 h.add("Anil");
		 h.add("suresh");
		 h.add("ramesh");
		 h.add("karthik");
		 
		 
		 Set<String>ls=new LinkedHashSet<String>();
		 ls.add("rahul");
		 ls.add("bikas");
		 ls.add("chiku");
		 ls.add("dinesh");
		 ls.add("raghav");
		 
		 
		 Set<String>ts=new java.util.TreeSet<>();
		 ts.add("anil");
		 ts.add("kumar");
		 ts.add("baral");
		 ts.add("dinesh");
		 ts.add("chinu");
		 
		 
		 System.out.println(ts);
		 System.out.println();
		 System.out.println(ls);
		 System.out.println();
		 System.out.println();
	 System.out.println(h);		 
	  Iterator i=h.iterator();
	  System.out.println();
	  System.out.println();
	 while(i.hasNext()) {
		     System.out.println(i.next());
	 }//while
	 
	 
		
	}

}
