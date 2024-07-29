package acc.br.enumeracao;

public class EnumEstacoesdoAno {
    
	public enum EstacoesDoAno{
        PRIMAVERA,
        VERAO,
        OUTONO,
        INVERNO
    }
    
	public static void main(String[] args) {
        for (EstacoesDoAno estacao : EstacoesDoAno.values()) {
            System.out.println(estacao);
        }
	}

}