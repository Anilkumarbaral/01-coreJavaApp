package collection.corejava;

import java.util.ArrayList;

public class ArrayList_fromNote_P1 {

	public static void main(String[] args) {
		  ArrayList <Object>al= new ArrayList();
		  System.out.println("before add element: "+al.isEmpty());
		      al.add("a");
		      al.add(3);
		      al.add("b");
		      al.add(8);
		      al.add(10);
		      al.add("c");
		      al.add(null);
		      al.add(true);
		      al.add(9);
		      System.out.println("after add element :"+al.size());
		      System.out.println(al);
		      System.out.println("retrieving object");
		      System.out.println(al.get(3));
		      
		      

	}

}
