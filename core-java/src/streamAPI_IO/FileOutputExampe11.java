package streamAPI_IO;
import java.io.FileOutputStream;
public class FileOutputExampe11 {

	public static void main(String[] args)throws Exception {//setp-2
	 
              FileOutputStream  fos=new FileOutputStream("E:\\FileTest.txt");//step-3
                fos.write(97);
                String txt="  Welcome to java is very easy to learn if consistenly learn";
                byte[]convert=txt.getBytes();
                fos.write(convert);
                System.out.println("sucessfully write");
                fos.close();//step-4
	}

}
