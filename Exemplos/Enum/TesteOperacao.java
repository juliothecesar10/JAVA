package acc.br.enumeracao;

public class TesteOperacao {

	public static void main(String[] args) {
		double result;
        result = EnumOperation.SOMA.calculate(1, 2);
        System.out.println(result); //3.0
        result = EnumOperation.SUBTRACAO.calculate(1, 2);
        System.out.println(result); //3.0
	}

}
