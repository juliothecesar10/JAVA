package sef.module6.sample;

public class PrincipalEletro {

	public static void main(String[] args) {
		TV tv1 = new TV(29,110);
		Radio radio1 = new Radio(110);
		
		tv1.ligar();
		radio1.ligar();
		
		System.out.println(tv1.isLigado() ? "A TV esta ligada" : "A TV esta desligada");
		System.out.println(radio1.isLigado() ? "O Rádio esta ligado" : "O Rádio esta desligado");
		System.out.println();

		tv1.desligar();
		radio1.desligar();

		System.out.println(tv1.isLigado() ? "A TV esta ligada" : "A TV esta desligada");
		System.out.println(radio1.isLigado() ? "O Rádio esta ligado" : "O Rádio esta desligado");
	}

}
