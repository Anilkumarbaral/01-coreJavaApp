package collection.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverse_number {

	public static void main(String[] args) {
		  ArrayList <Object>list=new ArrayList<>();
		  
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            
            Iterator <Object>i=list.iterator();
            
            System.out.println("printing the list");
            System.out.println();
            while(i.hasNext()) {
            	   System.out.println(i.next());
            	  
            }
            
            Iterator<Object>i2=list.iterator();
              Collections.reverse(list);
              System.out.println("printing revers list");
              while(i2.hasNext()) {
            	    System.out.println(i2.next());
              }
            
	}

}
