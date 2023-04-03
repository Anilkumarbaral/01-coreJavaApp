package collection.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import javax.swing.SortOrder;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<Integer>alsort=new ArrayList<Integer>();
		alsort.add(1);
		alsort.add(3);
		alsort.add(5);
		alsort.add(9);
		alsort.add(10);
		alsort.add(21);
		alsort.add(17);
		alsort.add(22);
		alsort.add(14);
		alsort.add(16);
		alsort.add(19);
		alsort.add(2);
		System.out.println(alsort.lastIndexOf(5));
		System.out.println("after adding elment in arralyist");
		System.out.println(alsort);
		for(int numb:alsort) {
			System.out.println(numb);
		}//reverse order with sorting
	 Comparator<Integer>cmp=Collections.reverseOrder();
			 Collections.sort(alsort,cmp);
		Iterator<Integer>io=alsort.iterator();
		System.out.println("sorting and reverseing number by using Iterator");
		while(io.hasNext()) {
			System.out.println(io.next());
		}
	
          
		
		System.out.println("after sorting");
		for(int numb:alsort) {
			System.out.println(+numb);
		}
		
	}

}
