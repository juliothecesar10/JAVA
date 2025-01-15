package sef.module4.sample;

public class CanetaPrincipal {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Azul","bic",true,false); 
		Caneta c2 = new Caneta(); 
		Caneta c3 = new Caneta(); 
		Caneta c4 = new Caneta(); 
		
		c2.setCor("Vermelha");
		c2.setMarca("futura");
		c2.setTampada(true);
		c2.setVazia(false);
		
		// System.out.println(c1.getCor()+"   "+ c1.getMarca());
		// System.out.println(c2.getCor()+"   "+ c2.getMarca());
		// System.out.println(c1.isTampada());
		c1.Destampar();
		c1.Riscar();
		
		c2.Riscar();
		
	}

}
