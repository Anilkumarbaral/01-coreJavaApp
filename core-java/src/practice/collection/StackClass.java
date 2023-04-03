package practice.collection;
import java.util.Stack;
public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> st=new Stack<>();
		System.out.println(st.empty());
		System.out.println(st.size());
		          st.add(2);
		          st.add(3);
		          st.add(null);
		          st.add(20);
		          st.add("anil");
		          System.out.println(st.size());
		          System.out.println(st);
//		          System.out.println(st.pop());
//		          System.out.println(st.pop());
//		          System.out.println(st.pop());
		          System.out.println();
		          System.out.println(st.peek());
		          System.out.println();
		          System.out.println(st.search("anil"));
		          System.out.println(st.search(2));
		          System.out.println(st.search(3));
		          System.out.println(st.search(3));
		          System.out.println(st.search(2));
	

	}

}
