package co.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		   Printjob [] jobs= {  new Printjob("anil"),
				                                new Printjob("durga"),
				                                new Printjob("shiva"),
				                                new Printjob("suresh"),
				                                new Printjob("ravi")	                                   
		   }   ;          
		  
		   ExecutorService service=Executors.newFixedThreadPool(3);
		      for(Printjob job:jobs) {
		    	     service.submit(job);
		      }
		      service.shutdown();

	}

}
