package acc.lambda.sample;

public class javaLambdaImpl {

   final static String salutation = "Hello! ";
   
   public static void main(String args[]) {
      GreetingService greetService1 = message -> System.out.println(salutation + message);
      
      greetService1.sayMessage("World");
      
   }
	 
   interface GreetingService {
      void sayMessage(String message);
   }
}
