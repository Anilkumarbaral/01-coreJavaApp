
public class Date_26_ReverseString {

	public static void main(String[] args) {
	    String name="anil";
	    //using 1st approach
	              //step-1
	         char[]ch=   name.toCharArray();
	         //step-2
	         for(int i=(ch.length)-1;i>=0;i--) {
	        	       System.out.print(ch[i]);
	        	        
	         }//for
	         //2nd approach
	         System.out.println();
	         
	         for(int i=(name.length())-1;i>=0;i--) {
	        	        
	        	   System.out.print(name.charAt(i));
	         }//for
	         //3rd approach
	         StringBuffer sb=new StringBuffer(name);
	         System.out.println();
	         System.out.print(sb.reverse());
	         System.out.println();
	         //4th approach
	         StringBuilder sbld=new StringBuilder(name);
	         System.out.print(sbld.reverse());

	}

}
