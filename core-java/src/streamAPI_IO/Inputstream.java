package streamAPI_IO;
import java.io.FileInputStream;
import java.util.Arrays;
public class Inputstream {

	public static void main(String[] args) {
		try {
		 FileInputStream inf=new FileInputStream("E:\\test.txt");
		    byte[] i=inf.readAllBytes();
		     
		    System.out.println(Arrays.toString(i));
		    inf.close();
		 
		}catch(Exception e) {
			  System.out.println(e);
		}

	}

}
