package br.familia;

public class Filho extends Pai {
	
	@Override
	public void seApresentar() {
		super.seApresentar();
		System.out.println("Método do Filho ");
	}
}