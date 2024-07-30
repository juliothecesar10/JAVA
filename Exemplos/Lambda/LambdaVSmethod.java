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
		Ainterface a = (String s) -> System.out.println(s); // Fornecendo implementação de getName(String name) usando Lambda
												   
		a.getName("SAM está executando");

		Ainterface a1 = LambdaVSmethod::getInfo; // Referindo-se a getInfo(String info) pré-existente da classe LambdaVSmethod
								                 // mesmo que getName(String name)
		a1.getName("getInfo() da class LambdaVSmethod está executando");
	}

}
