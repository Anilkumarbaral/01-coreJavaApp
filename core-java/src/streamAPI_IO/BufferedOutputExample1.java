package streamAPI_IO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferedOutputExample1 {

	public static void main(String[] args) throws Exception {
		        
		               FileOutputStream fout=new FileOutputStream("E:\\Test.txt");
		               //create Bufferedoutput class obj
		               BufferedOutputStream bost=new BufferedOutputStream(fout);
		               //write string 
		               String name="Java is very easy when u spend time on it";
		               byte[]b=name.getBytes();
		               bost.write(b);//storing the string after it conversion
		               //flush pushing into file like toilet flus
		               
		               bost.flush();
		               //for confirmation
		               System.out.println("sucess..");
		               //the last step for closing the all outputstream resources
		               bost.close();
		               
		               fout.close();
	}

}
