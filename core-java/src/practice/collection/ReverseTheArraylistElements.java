package practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseTheArraylistElements {

	public static void main(String[] args) {
	     List<String>fruitlist=new ArrayList<>();
         fruitlist.add("Mango");
         fruitlist.add("papapya");
         fruitlist.add("jackfruit");
         fruitlist.add("apple");
         fruitlist.add("promogranate");
         
              Iterator i=fruitlist.iterator();
              System.out.println("before reverse elements");
              while(i.hasNext()) {
            	   System.out.println(i.next());
              }
              System.out.println();
              System.out.println("after reverse elements");
              Iterator i2=fruitlist.iterator();
              Collections.reverse(fruitlist);
              while(i2.hasNext()) {
            	    System.out.println(i2.next());
              }

	}

}
