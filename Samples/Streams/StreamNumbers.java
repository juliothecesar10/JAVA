package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
*
* Um programa Java simples para demonstrar como usar o método de mapa e filtro Java 8.
* Neste programa, vamos converter uma lista de String em uma lista de Inteiros e
* em seguida, filtre todos os números pares.
*/

public class StreamNumbers {
 
	 public static void main(String[] args) {
	    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
	    System.out.println("Lista original: " + numbers);
	    List<Integer> even = numbers.stream()
	                                .map(s -> Integer.valueOf(s))
	                                .filter(number -> number % 2 == 0)
	                                .collect(Collectors.toList());
	  
	    System.out.println("Lista processada, só numeros pares: " + even);
	   }
}
