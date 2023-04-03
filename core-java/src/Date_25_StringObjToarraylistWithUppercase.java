import java.util.ArrayList;
import java.util.List;

public class Date_25_StringObjToarraylistWithUppercase {

	public static void main(String[] args) {
		List<String>name=new ArrayList<>();
		    name.add("ani");
		    name.add("kumar");
		    name.add("baral");
		    // want to display as uper case
		    System.out.println("before upercase: "+name);
		    
		     for(int i=0;i<name.size();i++) {
		    	          Object o=name.get(i);
		    	          String newname=(String)o;
		    	          System.out.print(newname.toUpperCase());
		     }

	}

}
