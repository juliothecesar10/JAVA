package acc.lambda.sample;

public class LambdaSimples {
	
	@FunctionalInterface
	interface Diga{  
		public String digaai();  
	}  

	public static void main(String[] args) {
		
		Diga s = ()->{return "Eu n�o tenho nada � dizer.";}; 
		
		System.out.println(s.digaai());  
	}
	
}