package acc.br.bigdecimal;

//Program to demonstrate toBigInteger() method of BigDecimal

import java.math.*;

public class MeuBigInteger01 {

	public static void main(String[] args)
	{

		// Assigning the BigDecimal b
		BigDecimal b = new BigDecimal("123.321");

		// Assigning the BigInteger value of BigDecimal b to BigInteger i
		BigInteger i = b.toBigInteger();

		// Print i value
		System.out.println("BigInteger value of " + b + " is " + i);
	}
}

