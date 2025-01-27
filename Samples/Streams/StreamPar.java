package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class StreamPar {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);
		lista.stream()
			.limit(7)
			.filter(e -> e % 2 == 0)
			.map(e -> e * 2)
			.forEach(System.out::println);
	}

}
