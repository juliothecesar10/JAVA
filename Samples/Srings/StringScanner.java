package acc.br.strings;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		
        char opcao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja continuar (s ou n):");
        opcao = entrada.nextLine().charAt(0);
        if (opcao == 's')
           System.out.println("Continua!");
        else if (opcao == 'n')
           System.out.println("Não Continua!");
        else 
           System.out.println("Opção Invalida!");
	}

}
