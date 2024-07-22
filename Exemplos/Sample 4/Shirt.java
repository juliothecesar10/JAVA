package sef.module4.activity;

public class Shirt {
	public String description;
	public char colorCode;
	public double price;
	
    public Shirt(String description, char colorCode, double price) {
		this.description = description;
		this.colorCode = colorCode;
		this.price = price;
	}

	public void Exibir() {
		System.out.println("Descrição da camisa: " + description);
		System.out.println("Cor da camisa: " + colorCode);
		System.out.println("Preço da Camisa: "+ price);
		System.out.println("---------------------------------------------");
	}
    
}
