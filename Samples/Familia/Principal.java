package br.familia;

public class Principal {

	public static void main(String[] args) {
			Avo avo = new Avo();
			avo.setNome("AVO");
			avo.seApresentar();
			System.out.println(avo.getProfissao());
			
			System.out.println();
			Pai pai = new Pai();
			pai.setNome("PAI");
			pai.seApresentar();
			System.out.println(pai.getProfissao());
			
			System.out.println();
			Filho filho = new Filho();
			filho.setNome("FILHO");
			filho.seApresentar();
			System.out.println(filho.getProfissao());
			filho.setAlto(true);
			System.out.println(filho.isAlto());
			
	}

}
