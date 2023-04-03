package practice.collection;
   import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
   
public interface ConversationArray_toArrayList {

	public static void main(String[]args) {
		 //creating Arraylist object
		     ArrayList<String>fruitlist=new ArrayList<>();
		                 fruitlist.add("Mango");
		                 fruitlist.add("papapya");
		                 fruitlist.add("jackfruit");
		                 fruitlist.add("apple");
		                 fruitlist.add("promogranate");
		                 System.out.println("converting Arraylist to array");
		                String[]items= fruitlist.toArray(new String[fruitlist.size()]);		
		                for(String s:items) {
		                	  System.out.println(s);
		                }
//		                for(int s=0;s<items.length;s++) {
//		                	      System.out.println(items[s]);
//		                }
		                System.out.println("converting array to arraylist");
		                   
		              List<String >list=new ArrayList<>();
		                        
		                        list=    Arrays.asList(items);
		                        System.out.println(list);
	}
	
	
	
}
