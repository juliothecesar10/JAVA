package sef.module8.sample;

import java.io.*;

public class CheckUnCheck1 {
	public static void main(String[] args) throws IOException {
		
		try {
			System.out.println(25 / 0);
			System.out.println("Esta instruçãoo nunca será executada porque o controle mudou para o bloco catch. ");
		} catch (ArithmeticException e) {
			System.out.println("Mudei!");
		} catch (Exception e) {
			System.out.println("Voc� est� tentando dividir por zero! Isso n�o est� certo!");
		} finally {
			System.out.println("Este código está no bloco finally. Ele não depende se uma exceção ocorreu ou não. ");
		}
	}
	
	

}