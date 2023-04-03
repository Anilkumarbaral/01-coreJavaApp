package collection.corejava;

import java.util.Vector;

public class VectorFrom_noteP2 {

	public static void main(String[] args) {
		 Vector<Object>v=new Vector<>();
		 System.out.println(v.isEmpty());
		   v.add("a");
		   v.add("b");
		   v.add(3);
		   v.add(6);
		   v.add(null);
		   v.add(true);
		   v.add(20);
		   v.add( 22);
		   v.add("anil");
		   v.add("sunil");
		   v.add(4);
		   System.out.println(v.size());
		   System.out.println(v);
		   // retrieving object
		   System.out.println(" retrieving "+v.get(8));
		   System.out.println(v);
	}

}
