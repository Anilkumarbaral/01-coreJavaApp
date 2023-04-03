package collection.corejava;

import java.util.Arrays;
import java.util.List;

public class ArrryaToCollection {

	public static void main(String[] args) {
	            
		               String [] sampleTest= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		               
		                     int len=sampleTest.length;
		                     System.out.println("the input elements are follows");
		                     for(int i=0;i<len;i++) {
		                    	   System.out.println(sampleTest [i]+"   ");
		                     }
		               System.out.println();//setting to cursor to next line
		               
		                 List converToArray= Arrays.asList(sampleTest);//convert array to list
		                 //print array converted to List 
		                 System.out.println("coverted to List elements are "+converToArray);

	}

}
