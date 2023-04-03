package streamAPI_IO;
import java.io.FileOutputStream;
public class FileoutputStreamExample2 {

	public static void main(String[] args) {
		                try {
		                	   FileOutputStream fout=new FileOutputStream("E:\\test.txt");
		                	   String name="Anil kumar baral";
		                	   byte[]b=name.getBytes();//for this conversation string data to byte [
		                	   //using write method
		                	   fout.write(b);
		                	   //closing the connetion
		                	   System.out.println("sucess..");
		                	   fout.close();
               	   
		                }//try
		                catch(Exception e) {System.out.println(e);}
	}

}
