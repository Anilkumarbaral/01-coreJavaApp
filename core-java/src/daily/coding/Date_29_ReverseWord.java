package daily.coding;

public class Date_29_ReverseWord {

	public static void main(String[] args) {
		 String str="programming";
		 //want to remove the duplicate elements
		 
		 //using approach-1
		 
		 StringBuilder sb=new StringBuilder();
		 System.out.println(str);
		 System.out.println("aafter");
		 
		     str.chars().distinct().forEach((p->sb.append((char)p)));
		     System.out.println(sb);

		     //using 2nd approach
		     //using for loop
		     StringBuilder sb2=new StringBuilder();
		     
		     for(int i=0;i<str.length();i++) {
		    	    char ch =str.charAt(i);
		    	   int indx    =str.indexOf(ch,i+1);
		    	//   System.out.println(indx);   returning the index of element 
		    	   //if return -1 if no duplicate element or rtn 1 if found duplicate element
		    	   if(indx==-1) {
		    		      sb2.append(ch);
		    	   }
		     }//for
		     System.out.println(sb2);
	}

}
