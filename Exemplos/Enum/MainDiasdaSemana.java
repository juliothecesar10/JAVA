package acc.br.enumeracao;

public class MainDiasdaSemana {
	public static void avaliaDiaDaSemana(EnumDiasdaSemana diaDaSemana){
	    switch (diaDaSemana){
	        case DOMINGO:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DO DOMINGO");
	            break;
	        case SEGUNDA:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA SEGUNDA");
	            break;
	        case TERCA:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA TERCA");
	            break;
	        case QUARTA:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA QUARTA");
	            break;
	        case QUINTA:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA QUINTA");
	            break;
	        case SEXTA:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA SEXTA");
	            break;
	        case SABADO:
	            System.out.println("EXECUTANDO REGRA DE NEGÓCIO DO SABADO");
	            break;
	    }
	}
	
	public static void main(String[] args) {
		avaliaDiaDaSemana(EnumDiasdaSemana.DOMINGO);
	}

}
