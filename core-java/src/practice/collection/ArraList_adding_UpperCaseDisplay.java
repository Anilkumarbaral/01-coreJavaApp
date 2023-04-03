package practice.collection;

import java.util.ArrayList;

public class ArraList_adding_UpperCaseDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating ArrayList Collection class and initialize some value
		ArrayList<Object>arl=new ArrayList<>();
		//adding elements
		System.out.println(arl.isEmpty());
		System.out.println(arl.size());
		System.out.println(arl);
		        arl.add("anil");
		        arl.add("kumar");
		        arl.add("Baral");
		        System.out.println(arl.size());
		        System.out.println(arl);
		        //i want to result as uppercase
		        
		        for(int i=0;i<arl.size();i++) {
//		        	     Object obj=arl.get(i);
//		        	   String st=(String)obj;
		        	  String st=(String)arl.get(i);
		        	   System.out.print(st.toUpperCase()+" ");
		        }
		        System.out.println();
		        System.out.println(arl);

	}

}
