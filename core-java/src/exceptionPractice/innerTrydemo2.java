package exceptionPractice;

import java.util.*;

public class innerTrydemo2 {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a : " + a);
			try {
				int[] x = new int[a];
				System.out.println("array size: " + a);

			} // inner try
			catch (NullPointerException npe) {
				npe.printStackTrace();
			} // catch
		} // outer try
		catch (ArrayIndexOutOfBoundsException aoi) {
			aoi.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (NegativeArraySizeException nae) {
			int[] x = new int[3];
			System.out.println("in outer try array size: " + x.length);
		}
		System.out.println("after outer try/catch");

	}

}
