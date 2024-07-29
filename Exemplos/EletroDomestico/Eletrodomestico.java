package sef.module6.sample;

public abstract class Eletrodomestico {
	private boolean ligado;
	private int voltagem;
	
	// método abstratos não possuem corpo
	public abstract void ligar();
	public abstract void desligar();

	// Classes abstratas podem ter construtor, 
	// porém não podem ser usados para instnciar um objeto diretamente
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.ligado = ligado;
		this.voltagem = voltagem;
	}
	
	// Classes abstratas podem possuir métodos não abstratos
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	
}
