package daily.coding;

import java.util.Arrays;

public class Date_30_01_shortTheElement {

	public static void main(String[] args) {
		
		
		//declaring string
		       String str="anil";
		       
		       //there having two approach to short the character  1- is without using shorting method
		                                                                                          // 2 - is using short metod
		       
		         //approach -1
		       
		          char[]ar=str.toCharArray();
                         char temp;
		               for(int i=0;i<ar.length;i++) {
		            	   for(int j=i+1;j<ar.length;j++) {
		            		         if(ar[i]>ar[j]) {
		            		        	   temp=ar[i];
		            		        	ar[i]=ar[j];
		            		        	ar[j]=temp;
		            		         }
		            	   }
		               }
		               System.out.println(new String(ar));
		               
		               System.out.println();
		               
		               //usin 2nd approach
		               
		               char[]ch=str.toCharArray();
		               Arrays.sort(ch);
		               System.out.println(new String(ch));
		               
	}

}