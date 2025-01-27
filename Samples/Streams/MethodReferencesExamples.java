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

	        // Chamando o m�todo mergeThings com uma express�o lambda
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", (a, b) -> a + b));
	        
	        // Refer�ncia a um m�todo est�tico
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

	        // Refer�ncia a um m�todo de inst�ncia de um objeto espec�fico        
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", myApp::appendStrings2));
	        
	        // Refer�ncia a um m�todo de inst�ncia de um objeto arbitr�rio de um tipo espec�fico
	        System.out.println(MethodReferencesExamples.
	            mergeThings("Hello ", "World!", String::concat));
	    }

}
