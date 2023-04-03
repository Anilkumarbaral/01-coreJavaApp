package daily.coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Remove_fromArraylist {

	public static void main(String[] args) {
		   List<String>fruitlist=new ArrayList<>();
		   
		             fruitlist.add("mango");
		             fruitlist.add("apple");
		             fruitlist.add("jackfruit");
		             fruitlist.add("apple");
		             fruitlist.add("mango");
		             fruitlist.add("jackfruit");
		             fruitlist.add("banana");
		             
		             //i want removing elements from an arraylist
		             
		               //by using set interface
		             System.out.println("before removing duplicate elements");
		             System.out.println(fruitlist);
		             
		             Set<String>removedupli=new LinkedHashSet<String>(fruitlist);
		             //clear the arraylist by using cl
		             //clear method
		             
		             fruitlist.clear();
		             //copying removeduplicate elements from set
		             
		             fruitlist.addAll(removedupli);
		             System.out.println("after removing duplicate");
		             System.out.println(fruitlist);
		             
	}

}
