package acc.br.strings;

public class Pessoa {
	private String nome;
	private String idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return this.nome + ' ' + this.idade;
	}
}
