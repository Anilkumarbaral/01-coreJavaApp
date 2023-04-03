package practice.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removing_duplicateFromArraylist {

	public static void main(String[] args) {
	     List<String>fruitlist=new ArrayList<>();
         fruitlist.add("Mango");
         fruitlist.add("papapya");
         fruitlist.add("jackfruit");
         fruitlist.add("apple");
         fruitlist.add("Mango");
         System.out.println(fruitlist.toString());
         System.out.println(fruitlist);
         System.out.println("removing duplicate by using setclasses");
         Set<String>removeduplicate=new LinkedHashSet<>(fruitlist);
         System.out.println(removeduplicate);
         fruitlist.clear();
         System.out.println(fruitlist);
         fruitlist.addAll(removeduplicate);
         System.out.println();
         System.out.println(fruitlist);
	}

}
