package practice.collection;

import java.util.ArrayList;

public class DisplayArHectroindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist colletion
		ArrayList<Object>arl=new ArrayList<>();
		        //adding the elements 
		          arl.add("ani kumar");
		          arl.add(100000);
		          arl.add("suroj");
		          arl.add(50000);
		          arl.add("priyaranjan");
		          arl.add(40000);
		          
		          System.out.println("Ename/sal");
		          System.out.println("=======================");
		           for(int i=0;i<arl.size();i++) {
		        	     Object obj=arl.get(i);
		        	     
		        	     if(obj instanceof String) {
		        	    	     String st=(String)obj;
		        	    	     System.out.println(st.toUpperCase()+"\n");
		        	     }
		        	     else {
		        	    	 System.out.println(obj);
		        	     }
		           }
		          

	}

}
