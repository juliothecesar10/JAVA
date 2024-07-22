package sef.module8.sample;

public class ContaCorrente extends Conta {
	
	@Override
	public void deposito(int valor) {
		if (valor > 0) {
			System.out.println("Deposito Efetuado!");
		}
	}
	
}
