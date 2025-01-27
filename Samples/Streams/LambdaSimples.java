package acc.lambda.sample;

public class LambdaSimples {
	
	@FunctionalInterface
	interface Diga{  
		public String digaai();  
	}  

	public static void main(String[] args) {
		
		Diga s = ()->{return "Eu não tenho nada à dizer.";}; 
		
		System.out.println(s.digaai());  
	}
	
}