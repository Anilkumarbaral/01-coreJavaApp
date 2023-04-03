package string;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
	//there having 4 ways
		// 1 using java 8 feature
		//2 using travers
		
		
		String s="programming";
		
		 //using 1st approach
		 StringBuilder sb1=new StringBuilder();
		       s.chars().distinct().forEach(c->sb1.append((char)c));
		       System.out.println(sb1);
		       
		       //using 2nd approach
		       StringBuilder sb2=new StringBuilder();
		          for(int i=0;i<s.length();i++) {
		        	               char ch=s.charAt(i);
		        	              int indx= s.indexOf(ch,i+1);
		        	               if(indx==-1) {
		        	            	     sb2.append(ch);
		        	               }
		          }
		          System.out.println(sb2);
		          //3rd approach

	}

}
