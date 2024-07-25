package acc.br.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingMode01 {
    public static void main(String[] args) {
        // Creating BigDecimal objects
        BigDecimal num1 = new BigDecimal("123.45");
        BigDecimal num2 = new BigDecimal("67.89");

        // Addition
        BigDecimal soma = num1.add(num2);
        System.out.println("Soma: " + soma);

        // Subtraction
        BigDecimal deferenca = num1.subtract(num2);
        System.out.println("Diferença: " + deferenca);

        // Multiplication
        BigDecimal produto = num1.multiply(num2);
        System.out.println("Produto: " + produto);

        // Division
        BigDecimal quociente = num1.divide(num2, RoundingMode.HALF_UP);
        System.out.println("Quociente: " + quociente);
    }
}
