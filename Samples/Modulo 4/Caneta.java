package sef.module4.sample;

public class Caneta {
	private String cor;
	private String marca;
	private boolean vazia;
	private boolean tampada;
	
	public Caneta(String cor, String marca, boolean vazia, boolean tampada) {
		this.cor = cor;
		this.marca = marca;
		this.vazia = vazia;
		this.tampada = tampada;
	}
	
	public Caneta() {
		
	}

	public void Tampar() {
		this.tampada = true;
	}
	
	public void Destampar() {
		this.tampada = false;
	}
	
	public void Riscar() {
		if (isTampada()) {
			System.out.println("Não posso riscar, pois a Caneta esta tampada..");
		} else {
			System.out.println("Riscando....");			
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isVazia() {
		return vazia;
	}

	public void setVazia(boolean vazia) {
		this.vazia = vazia;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

}
	
