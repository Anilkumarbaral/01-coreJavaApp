package daily.coding;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Date_12_02_IfElse_hackerrank {
	/*
	 * If is n odd, print Weird If is even and in the inclusive range of 2 to 5 ,
	 * print Not Weird If is even and in the inclusive range of to , print Weird If
	 * is even and greater than , print Not Weird
	 */
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("pls enter number: ");

		int N = scanner.nextInt();
		String ans;

		if (N % 2 == 1)
			ans = "weird";

		else {
			if (N >= 2 && N <= 5)
				ans = "not weird";

			else if (N >= 6 && N <= 20)
				ans = "Weird";

			else
				ans = "not wired";
		}//else
		System.out.println(ans);

	}
}
