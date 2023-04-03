
public class xyz {

	public static void main(String[] args) {
		//removing duplicate elements from string
		             String str="programming";
		             StringBuilder sb=new StringBuilder();
		             
		            //approach 03 means conversion to array
		             
		             char[]arr=str.toCharArray();//conversion to char[]
		             
		             for(int i=0;i<arr.length;i++) {
		            	   boolean reapt=false;
		            	   for(int j=i+1;j<arr.length;j++) {
		            		     if(arr[i]==arr[j]) {
		            		    	       reapt=true;
		            		     }
		            	   }//inner loop
		            	   if(!reapt) {
		            		   sb.append(arr[i]);
		            	   }
		             }//outer for loop
		             System.out.println(sb);
	}

}
