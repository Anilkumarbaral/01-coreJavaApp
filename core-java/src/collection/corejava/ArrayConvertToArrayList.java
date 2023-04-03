package collection.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayConvertToArrayList {

	public static void main(String[] args) {
		//declare and initializing string arrays
	String [] cities= {"Odisha","Checnnai","Bangalore","Mumbai","Delhi","Gujurat"};//third type of arrays
	
	//convert array to ArraysList
	ArrayList<String>alCities=new ArrayList<String>(Arrays.asList(cities));
	//add new element to ArrayList
	alCities.add("Hariyan");
	alCities.add("Punjab");
	alCities.add("Kashmir");
	//print the ArrayList
//	Iterator<String>i=alCities.iterator();
//	
//  while(i.hasNext()) {
//	  System.out.println(i.next()+"\n");
//  }
//	
	for(String s:alCities) {
		System.out.println(s+"\n");
	}

	}

}
