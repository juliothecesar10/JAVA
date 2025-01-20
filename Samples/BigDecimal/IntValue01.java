package acc.br.bigdecimal;

//Java program to illustrate
//intValue() method
import java.math.*;
import java.io.*;

public class IntValue01  {
	public static void main(String[] args)
	{
		BigDecimal b1, b2;

		b1 = new BigDecimal("112878314.176");
		b2 = new BigDecimal("721231");

		System.out.println("The Integer Value of " + b1 + " is "+ b1.intValue());
		System.out.println("The Integer Value of " + b2 + " is "+ b2.intValue());
	}
}
	
