package new8features;

import java.util.stream.Stream;

public class StreamExampleUsing_Iterator {
	
//You can use stream to iterate any number of times. Stream provides predefined methods to deal with the logic you implement. In the following example, 
	//we are iterating, filtering and passed a limit to fix the iteration
	
	
	public static void main(String[] args) {
	  
		        Stream.iterate(1,element-> element+1).filter(element->element%5==0)
		        .limit(5).forEach(System.out::println);

	}

}
