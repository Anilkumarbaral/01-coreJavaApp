package collection.corejava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeue {

	public static void main(String[] args) {
		
		
		    Deque<String>dq=new ArrayDeque<>();
		    
		            dq.add("Ramesh");
		            dq.add("Rahul");
		            dq.add("Animesh");
		            dq.add("avinsha");
		            dq.add("ayushman");
		            
		            System.out.println(dq);
		            dq.offerFirst("Anil");
		         dq.offer("kumar");
		            System.out.println(dq);
		           
		            
		           Iterator i=dq.iterator();
		           System.out.println(dq.peek());
		           while(i.hasNext()) {
		        	   System.out.println(i.next());
		           }
	}

}
