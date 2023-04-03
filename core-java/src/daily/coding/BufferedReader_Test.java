package daily.coding;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Test {


	public static void main(String[] args)throws IOException {
		
		
		//Enter data using bufferedReader
		
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
      
      //read the data
                      System.out.println("please enter Strings");
                String name= reader.readLine();
                
                System.out.println(name);
		
		
	}

}
