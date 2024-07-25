package acc.br.bigdecimal;

import java.math.*;

public class MeuBigDecimal03 {
   public static void main(String[] args) {

      // create 3 BigDecimal objects
      BigDecimal bd1, bd2, bd3;

      bd1 = new BigDecimal("335.00");
      bd2 = new BigDecimal("335.00");
      bd3 = new BigDecimal("335");

      // create 2 boolean objects
      Boolean b1,b2;

      // assign the result of equals method to b1, b2
      b1 = bd1.equals(bd2);
      b2 = bd1.equals(bd3);
      // print b1, b2 values
      System.out.println( bd1 + " equals " + bd2 + " is " +b1);
      System.out.println( bd1 + " equals " + bd3 + " is " +b2 );
   }
}

