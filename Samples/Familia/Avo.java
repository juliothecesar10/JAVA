package br.familia;

public class Avo {
	private String nome;
	private String profissao;
	
	public Avo() {
		this.profissao = "Desenvolvedor";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void seApresentar() {
		System.out.println("Eu sou o "+ nome);
	}
}
