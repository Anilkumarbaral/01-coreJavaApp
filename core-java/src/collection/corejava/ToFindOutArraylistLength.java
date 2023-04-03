package collection.corejava;

import java.util.ArrayList;

public class ToFindOutArraylistLength {

	public static void main(String[] args) {//create Arraylist object
		    ArrayList<Integer>al=new ArrayList<Integer>();
		    //checkt he Arraylist length
		 //   System.out.println(al.size());
		 //add the element to arraylist
		    System.out.println("before adding element size:  "+al.size());
		    al.add(3);
		    al.add(5);
		    al.add(2);
		    al.add(8);
		    al.add(9);
		    al.add(0);
		    al.add(null);
		    System.out.println("after element in araylist  :"+al.size());
		    System.out.println("remove one element");
		    al.remove(1);
		    System.out.println(al.size());
		    // print the all element of arraylist
		    
		    System.out.println("print the all elemtnet");
		  
		    for(Integer i:al) {
		    	System.out.println(i);
		    }

	}

}
