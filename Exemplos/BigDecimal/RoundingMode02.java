package acc.br.bigdecimal;

import java.math.*;

public class RoundingMode02 {

   public static void main(String[] args) {

      // create 2 BigDecimal Objects
      BigDecimal bd1, bd2;

      bd1 = new BigDecimal("23342424");
      bd2 = new BigDecimal("324234234234");
    
      System.out.println("Adição of two BigDecimal "+bd1.add(bd2));
   
      System.out.println("Subtração of two BigDecimal "+bd1.subtract(bd2));
    
      System.out.println("Multiplicação of two BigDecimal "+bd1.multiply(bd2));
   
      System.out.println("O power do BigDecimal "+bd1.pow(4));
    
      System.out.println(bd2.divide(bd1, RoundingMode.HALF_UP));
            
   }
}
