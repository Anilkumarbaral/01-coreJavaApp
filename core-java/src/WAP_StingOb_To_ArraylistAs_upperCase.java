import java.util.ArrayList;
import java.util.stream.Collectors;

public class WAP_StingOb_To_ArraylistAs_upperCase {
//wap string obj to arraylist and diplay in uppercase
	public static void main(String[] args) {
		ArrayList<String>name= new ArrayList<>();
		       name.add("anil");
		       name.add("sunil");
		       name.add("from");
		       name.add("odihsa");
		       ///now im displaying in uppercase
		       
		          //using for loop
		       for(int i=0;i<name.size();i++) {
		    	   
		    	            Object ob=name.get(i);
		    	             String s=(String)ob;
		    	             System.out.print(s.toUpperCase()+" ");
		       }
		       //im trying to do in 8 features
		     

	}

}
