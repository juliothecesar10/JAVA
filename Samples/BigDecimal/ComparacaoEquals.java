package acc.br.bigdecimal;

//Java program to demonstrate equals() method

import java.io.*;
import java.math.*;

public class ComparacaoEquals {

	public static void main(String[] args)
	{
		
		BigDecimal b1, b2;

		b1 = new BigDecimal(6781);
		b2 = new BigDecimal("6781");

		if (b1.equals(b2)) {
			System.out.println(b1 + " and " + b2 + " are equal.");
		}
		else {
			System.out.println(b1 + " and " + b2 + " are not equal.");
		}
	}
}
