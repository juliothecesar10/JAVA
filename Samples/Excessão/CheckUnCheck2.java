package sef.module8.sample;

import java.io.*;

public class CheckUnCheck2 {
	public static void main(String[] args) throws IOException {

		try {
			int arr[] = { 1, 3, 4, 2, 45, 6 };
			System.out.println(arr[131]);
			System.out.println(25 / 0);
			System.out.println("Esta instrução nunca será executada porque o controle mudou para o bloco catch. ");
		} catch (ArithmeticException e) {
			System.out.println("Você está tentando dividir por zero! Isso não está certo!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você está tentando acessar um índice que não está no array!");
		} finally {
			System.out.println("Este código está no bloco finally. Ele não depende se uma exceção ocorreu ou não. ");
		}
	}

}