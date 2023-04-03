package daily.coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class Date_30_RemovingDuplicateElement {

	public static void main(String[] args) {
	   //aproch-1  chartAt
		//apprach-2  indexof using 
		//approach-3     toCharrArray()
		String str="programming";
		StringBuilder sb1=new StringBuilder();
		
		//approach -1
		   str.chars().distinct().forEach(c->sb1.append((char)c));
		   System.out.println("using 1st approch  :"+sb1);
		   
		   //approach -2
		   //using charAt
		   StringBuilder sb2=new StringBuilder();
		     for(int i=0;i<str.length();i++) {
		    	     char c=str.charAt(i);
		    	     int is=str.indexOf(c,i+1);
		    	      if(is==-1) {
		    	    	    sb2.append(c);
		    	      }
		     }//for
		     System.out.println("apporach2  "+sb2);
		  
		      
		
		//approach3
		
		    StringBuilder sb=new StringBuilder();
		    
		             //toCharrArray returning character array index
		        char[]arr=str.toCharArray();
		        
		        for(int i=0;i<arr.length;i++) {
		        	boolean reapt=false;
		        	  for( int j=i+1;j<arr.length;j++) {
		        		   if(arr[i]==arr[j]) {
		        			     reapt=true;
		        			     break;
		        		   }//if
		        		   
		        	  } //inner forloop
		        	  
		        	  if(!reapt)
		        		   sb.append(arr[i]);
		        }//outer for
		        System.out.println(sb);
		        
		        //approach 4
		        
		        StringBuilder sb3=new StringBuilder();
		        
		        Set<Character>st=new LinkedHashSet<>();
		         
		        for(int i=0;i<str.length();i++) {
		        	   st.add(str.charAt(i));
		        }
		             for(char c:st) {
		            	   sb2.append(c);
		             }
		             System.out.println(sb2);
		        }

	}


