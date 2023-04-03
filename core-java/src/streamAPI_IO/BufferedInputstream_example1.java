package streamAPI_IO;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputstream_example1 {

	public static void main(String[] args) throws Exception {
		
                           FileInputStream fis=new FileInputStream("E:\\Test.txt");
                     ///////creating buffered calss obj
                           BufferedInputStream bfst=new BufferedInputStream(fis);
                           
             /////reading the data
                           int i;
                           while((i=fis.read())!=-1) {
                        	      System.out.print((char)i);
                           }
                           bfst.close();
                           fis.close();
	}

}
