package streamAPI_IO;
import java.io.FileInputStream;
public class FileInputStreamExample11 {

	public static void main(String[] args) throws Exception{
	             FileInputStream fis=new FileInputStream("E:\\FileTest.txt");
	           char ch=  (char) fis.read();
	             System.out.println(ch);
	            System.out.println();
	            int a=0;
	            while((a=fis.read())!=-1) {
	            	System.out.print((char)a);
	            }
	            
	             fis.close();
	             

	}

}
