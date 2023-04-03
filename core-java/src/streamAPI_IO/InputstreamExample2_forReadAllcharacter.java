package streamAPI_IO;
import java.io.FileInputStream;
import java.util.Arrays;
public class InputstreamExample2_forReadAllcharacter {

	public static void main(String[] args) {
		try {
		 FileInputStream inf=new FileInputStream("E:\\test.txt");
		     
		        int i=0;
		        while((i=inf.read())!=-1) {
		        	System.out.print((char)i);
		        }
		 
		    inf.close();
		 
		}catch(Exception e) {
			  System.out.println(e);
		}

	}

}
