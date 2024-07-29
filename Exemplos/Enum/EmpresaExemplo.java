package acc.br.enumeracao;

public class EmpresaExemplo {

	
	public static void main(String[] args) {
		EnumEmpresa cName;

		Empresa ebay = new Empresa(EnumEmpresa.EBAY);
        ebay.Detalhes();
        
		Empresa paypal = new Empresa(EnumEmpresa.PAYPAL);
        paypal.Detalhes();

		Empresa google = new Empresa(EnumEmpresa.GOOGLE);
		google.Detalhes();
		
		Empresa yahoo = new Empresa(EnumEmpresa.YAHOO);
        yahoo.Detalhes();
        
		Empresa acc = new Empresa(EnumEmpresa.ACC);
        acc.Detalhes();
  
	}

}
