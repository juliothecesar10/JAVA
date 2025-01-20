package acc.br.bigdecimal;

//Java program to demonstrate compareTo() method
import java.io.*;
import java.math.*;

public class CompareTO01 {

	public static void main(String[] args)
	{

		// Creating 2 BigDecimal objects
		BigDecimal b1, b2;

		b1 = new BigDecimal(5891);
		b2 = new BigDecimal(23346);

		if (b1.compareTo(b2) == 0) {
			System.out.println(b1 + " and " + b2 + " are equal.");
		}
		else if (b1.compareTo(b2) == 1) {
			System.out.println(b1 + " is greater than " + b2 + ".");
		}
		else {
			System.out.println(b1 + " is lesser than " + b2 + ".");
		}
	}
}
