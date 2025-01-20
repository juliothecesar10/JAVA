package acc.br.bigdecimal;

import java.math.*;

public class MeuBigDecimal04 {
   public static void main(String[] args) {

      // create 2 BigDecimal Objects
      BigDecimal bd1, bd2;

      bd1 = new BigDecimal("2.36617");

      MathContext mc = new MathContext(3); // 3 precision

      // bg1 is rounded using mc
      bd2 = bd1.round(mc);

      String str = "The value " + bd1 + " after rounding is " + bd2;

      // print bg2 value
      System.out.println( str );
   }
}