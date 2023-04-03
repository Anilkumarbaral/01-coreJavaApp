import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFrom_arraylist {

	public static void main(String[] args) {
		     //remove duplicate element from arraylist
		// first define arraylist with initilized value
		//copy all elemt s to set and 
		//empty the arraylist by using clear method
		// and again copy the elements from set to list
		
		
		      List<Object>elements=new ArrayList<>();
		        elements.add("apple");
		        elements.add("jackfruit");
		        elements.add("apple");
		        elements.add("jackfruit");
		        elements.add("orange");
		        elements.add("orange");
		        //now im for removing duplicate now im using set 
		        System.out.println("before "+elements);
		        
		        Set<Object>removeduplicate=new LinkedHashSet<>(elements);
		        
		        elements.clear();
		        elements.addAll(removeduplicate);
		        System.out.println("after  "+elements);
	}

}
