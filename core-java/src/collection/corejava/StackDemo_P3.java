package collection.corejava;

import java.util.Stack;

public class StackDemo_P3 {

	public static void main(String[] args) {
		 Stack<String>sc=new Stack<>();
		 sc.add("a");
		 sc.push("b");
		 sc.push("c");
		 sc.push("d");
		 sc.add("e");
		 System.out.println(sc);
		 //retrieving and return to the programmer
		 sc.pop();
		 System.out.println(sc);
		 sc.pop();
		 System.out.println(sc);
		 //only for retrieving
		// sc.peek();
		 System.out.println(sc.peek());
		 System.out.println(sc);
		 System.out.println(sc.peek());
		 System.out.println(sc);
		 //searching for items
		 System.out.println(sc.search("b"));
		 System.out.println(sc.search("e"));
		 

	}

}
