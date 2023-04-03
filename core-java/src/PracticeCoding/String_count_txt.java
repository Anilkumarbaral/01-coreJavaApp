package PracticeCoding;

import java.util.Arrays;

public class String_count_txt {

	public static void main(String[] args) {
		String []allfiles= {"abc.txt","av.pdf","z.txt","adv.xml","alc.pdf","xyz.xml"};
		//finding how many txt and pdf and xml is there
		//    String file=Arrays.toString(allfiles);
		    int txtcount=0;
		    int pdfcount=0;
		    int xmlcount=0;
		    for(int i=0;i<allfiles.length;i++) {
		    	        if( allfiles[i].endsWith(".txt")) {
		    	        	  txtcount ++;
		    	        }
		    	     if( allfiles[i].endsWith(".pdf")) {
		    	        	pdfcount++;
		    	        }
		    	     if(allfiles[i].endsWith(".xml")) {
		    	    	  xmlcount++;
		    	     }
		    }//for
		    System.out.println(txtcount);
		    System.out.println(pdfcount);
		    System.out.println(xmlcount);

	}

}
