package acc.lambda.sample;

import java.util.HashMap;
import java.util.Map;

public class LambdMap {

	   public static void main(String...args) {

	        Map < Integer, String > coursesMap = new HashMap < Integer, String > ();
	        coursesMap.put(1, "C");
	        coursesMap.put(2, "C++");
	        coursesMap.put(3, "Java");
	        coursesMap.put(4, "J2EE");
	        coursesMap.put(5, "Python");
	        coursesMap.put(6, "Scala");
	   
	        // Impressão Com lambda
	        coursesMap.forEach((k, v) -> coursePrinter(k, v));

	        // Impressão por referencia
	        coursesMap.forEach(LambdMap::coursePrinter);

	    }

	    // common method to print map key value
	    private static void coursePrinter(Integer number, String brand) {
	        System.out.println("Curso num. : " + number + " e Nome do curso : " + brand);
	    }
}
