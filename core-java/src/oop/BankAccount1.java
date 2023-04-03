package oop;

public class BankAccount1 {
                // Bank account properties(values required to perform operations)
	          private long accNo;
	          private double balance;
	          private String username;
	          private String password;
	          
	          //parameterized constructor to initialize instance
	          public BankAccount1(long accNo,double balance,String username,String password) {
	        	  this.accNo=accNo;
	        	  this.balance=balance;
	        	  this.username=username;
	        	  this.password=password;
	          }
	          //BankAccount behaviour (an operation to complete a transaction)
	          public void deposite(double amt) {
	        	     if(amt<=0) {
	        	  //  	 throw new InvalidAmountException();
	        	     }
	        	     balance=balance+amt;
	          }
	          public static void main(String[]args) {}
	        static public void m2() {}
}
