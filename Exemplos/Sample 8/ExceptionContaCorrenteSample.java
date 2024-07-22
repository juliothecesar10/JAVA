package sef.module8.sample;

public class ExceptionContaCorrenteSample {

	public static void main(String[] args) {
		
	    Conta cc = new ContaCorrente();
	    cc.deposito(10);        
	    
	    try {
	        cc.saque(100);
	    } catch (SaldoInsuficienteException e) {
	        System.out.println(e.getMessage());
	    }
	}
}