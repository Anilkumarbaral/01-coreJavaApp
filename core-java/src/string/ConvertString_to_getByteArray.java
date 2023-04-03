package string;

import java.util.Arrays;

public class ConvertString_to_getByteArray {

	public static void main(String[] args) {
		
		  String st="java language is aswome";
		  
		  //now im converting string byte[] array
		  
		    byte[]barr=st.getBytes();
		       
		    
		      System.out.println(barr);//class object not value
		      System.out.println(Arrays.toString(barr));
		      for(byte b:barr) {
		    	    System.out.print((char)b);
		      }
		      

	}

}
