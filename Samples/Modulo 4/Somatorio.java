package sef.module4.sample;
import javax.swing.JOptionPane;

public class Somatorio {

	public static void main(String[] args) {
		String primeiroNumero, segundoNumero;
		int numero1, numero2, soma;
		
		primeiroNumero = JOptionPane.showInputDialog("Informe o primeiro inteiro");
		
		segundoNumero = JOptionPane.showInputDialog("Informe o segundo inteiro");
		
		numero1 = Integer.parseInt(primeiroNumero);
		numero2 = Integer.parseInt(segundoNumero);
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null,  "A soma foi = "+ soma, "Resultado", JOptionPane.ERROR_MESSAGE);

	}

}
