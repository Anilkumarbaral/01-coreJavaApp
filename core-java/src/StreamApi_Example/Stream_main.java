package StreamApi_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_main {

	public static void main(String[] args) {
	        //creating stream api
		 //approach 1
		List<Integer>ls=List.of(10,11,13,41,4,8,10,2,1);
	//	System.out.println(ls);
		   //     ls.add(70);
		//approach 2
		List<Integer>ls2=new ArrayList<>();
		    //    System.out.println(ls);
// approach 3
		      List<Integer>ls3 = Arrays.asList(2,4,8,10,2,1,23,2);
		      
		      
		      //without stream
		      List<Integer>listeven=new ArrayList<>();
		      
		       for(Integer i:ls) {
		    	     if(i %2 ==0) {
		    	    	 listeven.add(i);
		    	     }
		       }
		      System.out.println(ls);
		       System.out.println(listeven);
		       System.out.println();
		       
		       
		       //using stream
		      Stream<Integer>stream= ls.stream();
		             List<Integer>newlist=   stream.filter(i->i%2==0).collect(Collectors.toList());
		             System.out.println(newlist);
		             //more short
		             List<Integer>list2=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		             System.out.println(list2);
		             //find the greatest nmber from 20
		           List<Integer>newlist3=  ls.stream().filter(i->i>10).collect(Collectors.toList());
		           System.out.println(newlist3);
		             
	}

}
