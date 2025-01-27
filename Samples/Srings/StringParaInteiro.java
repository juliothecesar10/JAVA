package acc.br.strings;

import java.util.Scanner;

public class StringParaInteiro {

	public static void main(String[] args) {
		
		System.out.println("informe um valor inteiro:");
		System.out.println("");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); /* Vai pegar tudo até a primeira quebra de linha.
                                      Garanta que o número é válido!
                                   */
        try {
               int i = Integer.parseInt(str); // Caso você queira tipo int, que é o usual.
               long l = Long.parseLong(str); /* É essencialmente a mesma coisa que o int, mas tem um
                                                  limite de dados maior que o int, por consumir mais
                                                  memória para a variável, e, por consequência um limite
                                                  superior maior para o valor da variável.
                                               */
        } catch (NumberFormatException e) {
              System.out.println("Numero com formato errado!");
        } finally {
          s.close(); //fechar o Scanner para gerenciar melhor a memória.
        }
	}

}
