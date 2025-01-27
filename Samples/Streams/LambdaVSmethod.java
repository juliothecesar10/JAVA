package acc.lambda.sample;

@FunctionalInterface
interface Ainterface {
	public void getName(String name);
}

public class LambdaVSmethod {

	public static void getInfo(String info) {
		System.out.println(info);
	}

	public static void main(String[] args) {
		Ainterface a = (String s) -> System.out.println(s); // Fornecendo implementa��o de getName(String name) usando Lambda
												   
		a.getName("SAM estão executando");

		Ainterface a1 = LambdaVSmethod::getInfo; // Referindo-se a getInfo(String info) pr�-existente da classe LambdaVSmethod
								                 // mesmo que getName(String name)
		a1.getName("getInfo() da class LambdaVSmethod estão executando");
	}

}
