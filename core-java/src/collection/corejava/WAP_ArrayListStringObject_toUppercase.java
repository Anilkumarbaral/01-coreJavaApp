package collection.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WAP_ArrayListStringObject_toUppercase {

	public static void main(String[] args) {
	       
		              ArrayList<String>st=new ArrayList<>();
		                     st.add("apple");
		                     st.add("mango");
		                     st.add("  ");
		                     Collections.addAll(st, "raju","manas","swain","java","kaju");
		                     System.out.println(st);
		                    String s= st.toString();
		                    System.out.println();
		                    System.out.println(s);
		           // i want to be all uppercase
		                    for(int i=0;i<st.size();i++) {
		                    	  Object o=st.get(i);
		                    	  String sa=(String)o;
		                    	  System.out.print(sa.toUpperCase());
		                    }
		                      

	}

}
