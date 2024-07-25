package acc.br.bigdecimal;

import java.math.BigDecimal;  

public class MeuBigDecimal02 {
    public static void main(String[] args)     
	    {      
	        // Subtraindo com double
	        double a=0.03;
	        double b=0.02;
	        System.out.println(a-b);
	        // Subtraindo com BigDecimal
	        BigDecimal bd1=new BigDecimal("0.03");
	        BigDecimal bd2=new BigDecimal("0.02");
	        System.out.println(bd1.subtract(bd2));
	    }      
	} 

