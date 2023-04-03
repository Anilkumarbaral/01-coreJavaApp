import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Arraylist_decendingOrder {
//how to sort arraylist desciding order
	public static void main(String[] args) {
		      //declaring and initializing arraylist wiht value
		
		 List<Integer>number=new ArrayList<>();
		   
		                    number.add(30);
		                    number.add(80);
		                    number.add(20);
		                    number.add(100);
		                    number.add(40);
		                    number.add(60);
		                    number.add(70);
		                    
		                    //displaying the before sorting the lements
		                    System.out.println("displaying the elements before the sorting:  ");
		                 Iterator i=   number.iterator();
		                 
		                  while(i.hasNext()) {
		                	    System.out.println(i.next());
		                  }
		                  //now sorting 
		                  System.out.println("after reversea and sorting");
		                 Comparator<Object>cmp= Collections.reverseOrder();
		                 Collections.sort(number,cmp);
		                 Iterator i2=number.iterator();
		                 while(i2.hasNext()) {
		                	 System.out.println(i2.next());
		                 }
		                    

	}

}
