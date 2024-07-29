package acc.br.enumeracao;

public enum EnumOpcoesMenu {
	SALVAR(1),
	IMPRIMIR(2),
	ABRIR(3),
	VISUALIZAR(4),
	FECHAR(5);
	
	private int opcao;
    
	private EnumOpcoesMenu(int opcao) {
		this.opcao = opcao;
	}

	public int getOpcao() {
		return opcao;
	}

}
