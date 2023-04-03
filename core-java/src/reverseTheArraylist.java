import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class reverseTheArraylist {

	public static void main(String[] args) {
		        //reverse the arraylist
		
		  // declaring arraylist and initilize
		      List<Integer>number=new ArrayList<>();
		          number.add(20);
		          number.add(30);
		          number.add(40);
		          number.add(50);
		          number.add(60);
		          
		          
		          // now displaying the before reverse
		          
		          System.out.println(number);
		        Iterator i=  number.iterator();
		        System.out.println("before: ");
		        while(i.hasNext()) {
		        	    System.out.println(i.next());
		        }
		        System.out.println("after: ");
		        Iterator i2=number.iterator();
		        Collections.reverse(number);
		        while(i2.hasNext()) {
		        	System.out.println(i2.next());
		        }

	}

}
