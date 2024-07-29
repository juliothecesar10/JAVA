package acc.br.enumeracao;

public class PrincipalMenu {

	public static void main(String[] args) {
		
		executaOpcao(EnumOpcoesMenu.ABRIR);
		System.out.println(EnumOpcoesMenu.ABRIR.getOpcao());
		
		validaErro(EnumCodigosErro.BUSINESS_ERROR);
	}
	
	public static void executaOpcao(EnumOpcoesMenu opcao) {
		if (opcao == EnumOpcoesMenu.SALVAR) {
			System.out.println("Salvando arquivo ...");
		} else if (opcao == EnumOpcoesMenu.ABRIR) {
			System.out.println("Abrindo arquivo...");
		}
	}
	
	public static void validaErro(EnumCodigosErro erro) {
		System.out.println(erro);
		System.out.println(erro.getCodigoErro());
	}
}