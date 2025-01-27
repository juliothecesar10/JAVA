package acc.lambda.sample;
import java.util.function.BiFunction;

public class MethodReferencesExamples {

	 public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
	        return merger.apply(a, b);
	    }
	    
	    public static String appendStrings(String a, String b) {
	        return a + b;
	    }
	    
	    public String appendStrings2(String a, String b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        
	        MethodReferencesExamples myApp = new MethodReferencesExamples();

	        // Chamando o método mergeThings com uma expressão lambda
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", (a, b) -> a + b));
	        
	        // Referência a um método estático
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

	        // Referência a um método de instância de um objeto específico        
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", myApp::appendStrings2));
	        
	        // Referência a um método de instância de um objeto arbitrário de um tipo específico
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", String::concat));
	    }

}
