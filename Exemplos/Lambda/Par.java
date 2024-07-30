package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class Par {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);
		
		lista.forEach(n -> System.out.println(n));
		
		lista.forEach(n -> {if (n % 2 == 0) {System.out.println(n*2);}});
	
//		for (int i = 0; i < 7; i++) {
//			Integer numero = lista.get(i);
//			if (numero % 2 == 0) {
//				System.out.println(numero * 2);
//			}
//		}
	}
}
