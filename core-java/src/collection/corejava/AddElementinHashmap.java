package collection.corejava;

import java.util.HashMap;

public class AddElementinHashmap {

	public static void main(String[] args) {
		HashMap<String,String>hasmap=new HashMap<String,String>();
		//adding element to HashMap
		hasmap.put("1", "value1");
		hasmap.put("2", "value2");
		hasmap.put("3", "value3");
		hasmap.put("4", "value4");
		hasmap.put("5", "value5");
		hasmap.put("6", "value6");
		System.out.println(hasmap);
		System.out.println(hasmap.isEmpty());
		System.out.println(hasmap.size());
	System.out.println(	hasmap.getClass());
	}

}
