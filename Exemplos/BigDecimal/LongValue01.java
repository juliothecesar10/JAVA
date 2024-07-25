package acc.br.bigdecimal;

//Java program to illustrate
//intValue() method
import java.math.*;
import java.io.*;

public class LongValue01  {
	public static void main(String[] args)
	{
		// Creating 2 BigDecimal Objects
		BigDecimal b1, b2;
		// Assigning values to b1, b2
		b1 = new BigDecimal("11287834234242314.176");
		
		// printing BigDecimal Long Values
		System.out.println("The Integer Value of " + b1 + " is "+ b1.longValue());
		System.out.println("The Integer Value of " + b1 + " is "+ b1.intValue());
	}
}

