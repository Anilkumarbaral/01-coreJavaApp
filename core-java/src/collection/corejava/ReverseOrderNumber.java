package collection.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ReverseOrderNumber {

	public static void main(String[] args) {
		  ArrayList<Integer> list= new ArrayList<>();
		  list.add(10);//value add
		  list.add(30);
		  list.add(50);
		  list.add(70);
		  list.add(20);
		  list.add(90);
		  list.add(80);
		  
		  Iterator<Integer>i=list.iterator();//  to cycle through arguments or elements present in a collection
		  System.out.println("print list..");
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
		  Comparator<Integer>cmp=Collections.reverseOrder();
		  Collections.sort(list,cmp);// comparing element and sorting accordingly
		  System.out.println("now printing reverse order");
		  Iterator<Integer>i2=list.iterator();
		  while(i2.hasNext()) {
			       System.out.println(i2.next());
		  }
	}

}
