package multithread;

public class PrintNumber extends Thread{
	
           public void Print1to50() {
        	         for(int i=0;i<50;i++) {
        	        	    System.out.println(i+"\t");
        	        	    try {Thread.sleep(100);}
        	        	    catch(InterruptedException ie) {
        	        	    	ie.printStackTrace();
        	        	    }
        	        	  //  System.out.println();
        	         }
           }
           public void Print50to1() {
        	            for(int i=50;i>=1;i--) {
        	            	   System.out.println(i+"\t");
        	            	   try {Thread.sleep(100);}
        	            	   catch(InterruptedException ie) {
        	            		   ie.printStackTrace();
        	            	   }
        	            }
           }
	public static void main(String[] args) {
      
                   PrintNumber pt=new PrintNumber();
                   long time1=System.currentTimeMillis();
                            pt.Print1to50();
                            System.out.println();
                            pt.Print50to1();
                            long time2=System.currentTimeMillis();
                            System.out.println("time takedn to compelete both task: "+((time2-time1)/1000)+"secs");
	}

}
