package acc.br.bigdecimal;

//Java program to demonstrate the
//round() method
import java.math.*;

public class Rounding01 {

	public static void main(String[] args)
	{
		// Assign value to BigDecimal object b1
		BigDecimal b1 = new BigDecimal("5.585");

		MathContext m = new MathContext(3); // 4 precision

		// b1 is rounded using m
		BigDecimal b2 = b1.round(m);

		// Print b2 value
		System.out.println("O valor de " + b1 + " após o rounding " + b2);
	}
}
