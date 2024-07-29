package acc.br.enumeracao;

public class Empresa {
	EnumEmpresa cName;

	public Empresa(EnumEmpresa cName) {
		this.cName = cName;
	}

    public void Detalhes() {
        switch (cName) {
            case EBAY:
                System.out.println("EBAY: Biggest Market Place in the World.");
                break;
             case PAYPAL:
                System.out.println("PAYPAL: Simplest way to manage Money.");
                break;
             case GOOGLE:
                System.out.println("GOOGLE: 1st Web Search Engine.");
                break;
            case YAHOO:
                System.out.println("YAHOO: 1st Web 2.0 Company.");
                break;
            case ACC:
                System.out.println("ACC: Global Service Provider.");
                break;
            default:
                System.out.println("DEFAULT: Google - biggest search giant.. ACC - my service provider..");
                break;
        }
    }
}
