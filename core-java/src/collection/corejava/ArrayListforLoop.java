package collection.corejava;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;
//Q1. Write a program to traverse (or iterate) ArrayList? (Solution)
//As I already mentioned,you can traverse ArrayList using for loop, while loop, 
//advance for loop and iterator. This question tests knowledge of add() method of ArrayList and looping concept. Below example traverses ArrayList using advance for loop:

public class ArrayListforLoop {

	public static void main(String[] args) {
		   ArrayList<String>arrayElement=new ArrayList<>();
		     //add element to arraylist
		       arrayElement.add("a");
		       arrayElement.add("b");
		       arrayElement.add("c");
		       arrayElement.add("d");
		       
		    //   using advaced loop
		       System.out.println("using advanced loop");
		       for(String num:arrayElement) {
		    	   System.out.println("result:"+num);
		       }
		     
	}

}
