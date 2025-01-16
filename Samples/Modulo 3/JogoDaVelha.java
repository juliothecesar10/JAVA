package sef.module3.sample;

public class JogoDaVelha {
		
	public static void main(String[] args) {
		String[][] tabuleiro = { 
						{" "," "," "},
						{" "," "," "},
						{" "," "," "}};
 	
		do {		
			// impressão do tabuleiro
			System.out.print("\n\n 0   1    2\n\n");
			for (int posicao1 = 0; posicao1 < 3; posicao1++) {
				for (int posicao2 = 0; posicao2 < 3; posicao2++) {
					System.out.print(" " + tabuleiro[posicao1][posicao2]);
					if (posicao2 < 2) {
						System.out.print(" | ");
					}
					if (posicao2 == 2) {
						System.out.print("  " + posicao1);
					}
				}
				if (posicao1 < 2) {
					System.out.print("\n------------");
				}
				System.out.println("\n");
			}
		} while (false);
	}
}
