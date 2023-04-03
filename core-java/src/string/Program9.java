package string;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("ple enter ur mobile no.");
			String mon =scn.next();
			if(mon.isBlank()) {
				System.out.println(" mobile number is should be passed");
			}
			else {
				try {
					long m=Long.parseLong(mon);
					if(m !=10) {
						System.out.println("Mobile no. should be 10 digit");
						continue;
					}else {
						System.out.println("Activation key has been sent your mobile number");
						System.out.println("pls enter your OTP");
						break;
					}
				}catch(NumberFormatException nfe ) {
					System.out.println("mobile number should be contain digit");
					continue;
				}
			} 
				
			}
		}

	}


