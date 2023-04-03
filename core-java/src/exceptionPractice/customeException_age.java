package exceptionPractice;

import java.util.Scanner;

//calling explicitly userdefined or custome exception 
//by using age
public class customeException_age extends RuntimeException{
	              private String name;
	              private int age;
             public customeException_age(String name,int age) {
				             try {
				            	 if(age<18||age>26) {
				            		 String sms="age not between 18 to 26";
				            		 AgeDoesNotmatchException ex=new AgeDoesNotmatchException(sms);
				            		 throw(ex);
				            	 }
				             }catch(AgeDoesNotmatchException ae) {
				            	 ae.printStackTrace();
				             }
				            	         this.age=age;
				            	         this.name=name;
				            	         
				             }
			public  void display() {
			
				    System.out.println("Name: "+name);
				    System.out.println("age: "+age);
			}
	public static void main(String[] args) {
		      
	                  Scanner scn=new Scanner(System.in);
	                  System.out.println("pls enter name: ");
	                       String name=scn.next();
	                       System.out.println("pls enter age: ");
	                       int age=scn.nextInt();
	                       customeException_age ob=new customeException_age(name,age);
	                       ob.display();
	                  
	}

}
