package sef.module8.sample;

public abstract class Conta {

	private double saldo;
	
	public Conta() {
		super();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(int valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
	    if (this.saldo < valor) {
	       throw new SaldoInsuficienteException("Saldo Insuficiente," +  
	                                            "tente um valor menor");
	    } else {
	        this.saldo-=valor;        
	    }        
	}
}