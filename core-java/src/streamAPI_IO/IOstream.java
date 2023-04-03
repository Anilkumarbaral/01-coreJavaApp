package streamAPI_IO;
import java.io.*;
public class IOstream {

	public static void main(String[] args) throws FileNotFoundException,IOException {
	
                           FileInputStream fis=new FileInputStream("");
                           int data=fis.read();//read data from
                           int data2=fis.read();
                           System.out.println(data2+" "+(char)data);
                           fis.close();
	}

}
