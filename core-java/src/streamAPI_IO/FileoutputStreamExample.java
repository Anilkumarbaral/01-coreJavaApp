package streamAPI_IO;

import java.io.FileOutputStream;

public class FileoutputStreamExample {

	public static void main(String[] args) {
		 try {
			    FileOutputStream fout=new FileOutputStream("E:\\testout.txt");//step two
			      fout.write(65);//step -3 write 
			      fout.close();//step-4
			      System.out.println("sucess");
//		 }catch(IOException io) {
//			 System.out.println(io);
		 }catch(Exception e) {
			 System.out.println(e);
		 }

	}

}
