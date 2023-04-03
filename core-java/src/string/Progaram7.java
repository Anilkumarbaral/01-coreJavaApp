
package string;

import java.util.Scanner;

public class Progaram7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Pls enter ur password");
		while(true) {
			String pwd=scn.nextLine();
			if(pwd.isEmpty()) {
				System.out.println("do not pass empty number..");
				continue;
			}else {
				int len =pwd.length();
				if(len<8||len>16) {
					System.out.println("password should be in between 8 and 16");
				}else {
					System.out.println("hii u successfully login");
				}
			}
		}
	}

}
