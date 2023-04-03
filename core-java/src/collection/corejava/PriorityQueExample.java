package collection.corejava;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueExample {

	public static void main(String[] args) {
		  
		
		//creating priority que collection 
		
	 
	  PriorityQueue<Object>pq=new PriorityQueue<>();
	  
	    pq.add("Rakes");
	    pq.add("suroj");
		pq.add("Mahesh");
		pq.add("Sunil");
		pq.add("avinash");
		
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println("before removing element ");
	//	System.out.println(pq);
		
		 Iterator i=pq.iterator();
		 
		 while(i.hasNext()) {
			 System.out.println("   "+i.next());
		 }
		pq.remove();
		pq.poll();
		pq.offer("kkk");
		
		System.out.println("after removing elements");
		Iterator i2=pq.iterator();
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
