package oop;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		                    //person one
		                    b.accountNo=1813810313123123L;
		                    b.accountHolder="Manasi Swain";
		                    b.accountbalance=500000;
		                    //person two
		                    BankAccount b2=new BankAccount();
		                    b2.accountNo=342342532423L;
		                    b2.accountHolder="Anil kumar Baral";
		                    b2.accountbalance=100000000;
		                    
		                    
		                    
		                    System.out.println(b.accountHolder);
		                    System.out.println(b.accountNo);
		                    System.out.println(b.accountbalance);
		                    
		                    System.out.println();
		                    
		                    System.out.println(b2.accountHolder);
		                    System.out.println(b2.accountNo);
		                    System.out.println(b2.accountbalance);
		                   
		                    

	}

}
