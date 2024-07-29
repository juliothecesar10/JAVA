package acc.br.enumeracao;

public enum EnumPeriodoCurso2 {
    	MANHA(1), 
    	TARDE(2), 
    	NOITE(3);
    
    private int codigo;

	private EnumPeriodoCurso2(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}  
}
