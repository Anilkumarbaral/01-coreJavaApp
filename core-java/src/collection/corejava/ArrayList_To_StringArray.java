package collection.corejava;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_To_StringArray {

	public static void main(String[] args) {
		//create Arraylist and initialize
		  ArrayList<String>al=new ArrayList<>();
		       al.add("mango");
		       al.add("apple");
		       al.add("banana");
		       al.add("jackfruit");
		       for(String str:al) {
		    	   System.out.println("arraylist result:"+str);
		       }
		       
		       //converting Arraylist o String array
		       String []st= new String[al.size()];
		            for(int i=0;i<al.size();i++) {
		            	    st [i]=al.get(i);	            	   
		            }
		            //print element using for loop
		            for(String s:st) {
		            	System.out.println(s);
		            }
		            
	}

}
