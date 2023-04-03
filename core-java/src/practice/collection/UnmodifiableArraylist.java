package practice.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiableArraylist {

	public static void main(String[] args) {
		List<String> fruitlist = new ArrayList<>();
		fruitlist.add("Mango");
		fruitlist.add("papapya");
		fruitlist.add("jackfruit");
		fruitlist.add("apple");
		fruitlist.add("promogranate");
		List<String> unmodifiable = Collections.unmodifiableList(fruitlist);
		    System.out.println(fruitlist);
		    System.out.println(unmodifiable);
		    System.out.println();
		    unmodifiable.add("banana");

	}

}
