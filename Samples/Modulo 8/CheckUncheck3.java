package sef.module8.sample;

import java.io.*;

class ExcecaoCustomizada extends Exception {

	public ExcecaoCustomizada(String str) {
		super(str);
	}
}

public class CheckUncheck3 {
	public static void main(String[] args) {
		try {
			// código que levanta uma exceção
			throw new ExcecaoCustomizada("Esta é uma exceção customizada"); // Coloque sua mensagem personalizada
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
