package daily.coding;

public class Date_01_02_replaceChar {
//wap to replace a character with its occurrence in given string
	public static void main(String[] args) {
		  String input="OPENTEXT";
		  //out put:  open1ex2
		  
		  char charreplace='T';
		  
		  // checking the character is availavle or not
		  
		  if(input.indexOf(charreplace)==-1) {
			    System.out.println("this is character is not available");
			    System.exit(0);
		  }
		  
		  //if availavle
		    int count=1;
		      for(int i=0;i<input.length();i++) {
		    	       char ch=input.charAt(i);
		    	       if(ch==charreplace) {
		    	    	    input= input.replaceFirst(String.valueOf(charreplace), String.valueOf(count));
		    	    	     count++;
		    	       }
		      }//for
		      System.out.println(input);
	}

}
