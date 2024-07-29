package sef.module6.sample;

public class TV extends Eletrodomestico {
	private int tamanho;
	private int canal;
	private int volume;
	
	public TV(int tamanho, int voltagem) {
		super(false, voltagem);
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
	}
	
	public void desligar() {
		super.setLigado(false);
		canal = 0;
		volume = 0;
	}	
	
	public void ligar() {
		super.setLigado(true);
		canal = 3;
		volume = 25;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
