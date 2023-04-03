package practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortInDescendingOrder {

	public static void main(String[] args) {
	     List<Object> number=new ArrayList<>();
         number.add(10);
         number.add(30);
         number.add(80);
         number.add(20);
         number.add(50);
         Iterator i=number.iterator();
         System.out.println("before descending order without sorting");
         while(i.hasNext()) {
        	 System.out.println(i.next());
         }
         System.out.println();
         Comparator<Object> cmp=Collections.reverseOrder();
         Collections.sort(number,cmp);
         Iterator i2=number.iterator();
         System.out.println("printing the number sorted with descending order");
         while(i2.hasNext()) {
        	 System.out.println(i2.next());
         }
	  

	}

}
