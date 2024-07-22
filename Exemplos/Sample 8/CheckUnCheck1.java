package sef.module8.sample;

import java.io.*;

public class CheckUnCheck1 {
	public static void main(String[] args) throws IOException {

		try {
			System.out.println(25 / 0);
			System.out.println("Esta instrução nunca será executada porque o controle mudou para o bloco catch. ");
		} catch (Exception e) {
			System.out.println("Você está tentando dividir por zero! Isso não está certo!");
		} finally {
			System.out.println("Este código está no bloco finally. Ele não depende se uma exceção ocorreu ou não. ");
		}
	}

}