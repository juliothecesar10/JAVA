package acc.lambda.sample;

public class lambdaUm {
	@FunctionalInterface
	interface Imprimivel{  
		public String imprima(int val1, int val2);  
	}  
	
	public static void main(String[] args) {
		Imprimivel imp = (val1, val2)->{ 
											System.out.println(val1);
											System.out.println(val2);
											return ".";
										}; 
			
		imp.imprima(1,2);
	}

}
