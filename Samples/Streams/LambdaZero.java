package acc.lambda.sample;

public class LambdaZero {
	   @FunctionalInterface
	   interface Saudacoes {
	      void digaAI(String message);
	   }
	   
	   public static void main(String args[]) {
			
		  //Sem parentesis
		   Saudacoes saudacoes1 = message -> System.out.println("Ola " + message);
			
	      //Com parentesis
		   Saudacoes saudacoes2 = (message) -> System.out.println("Hello " + message);
			
	      saudacoes1.digaAI("Maria");
	      saudacoes2.digaAI("Jhon Doe");
	   }
}