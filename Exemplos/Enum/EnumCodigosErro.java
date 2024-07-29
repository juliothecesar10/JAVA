package acc.br.enumeracao;

public enum EnumCodigosErro {
	BUSINESS_ERROR(100),
	SERVER_ERROR(200),
	NETWORK_ERROR(300);
	
	private int codigoErro;

	private EnumCodigosErro(int codigoErro) {
		this.codigoErro = codigoErro;
	}

	public int getCodigoErro() {
		return codigoErro;
	}	
}