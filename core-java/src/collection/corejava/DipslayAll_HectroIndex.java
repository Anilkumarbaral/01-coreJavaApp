package collection.corejava;

import java.util.ArrayList;

public class DipslayAll_HectroIndex {

	public static void main(String[] args) {
		   ArrayList<Object>al=new ArrayList<>();
		   al.add("Anil");
		   al.add(100000);
		   al.add("charndrakat");
		   al.add(3999);
		   al.add("Srikant");
		   al.add(1000);
		 //  System.out.println(al);
		   for(int i=0;i<al.size();i++) {
			   Object obj=al.get(i);
			   if(obj instanceof String) {
				      String st=(String)obj;
				      System.out.println(st.toUpperCase()+"\n");
			   }else {
				   System.out.println(al);
			   }
		
		   }
		   

	}

}
