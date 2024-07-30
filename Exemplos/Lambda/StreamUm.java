package acc.lambda.sample;

import java.util.stream.IntStream;

public class StreamUm {

	public static void main(String[] args) {
	    int[] numerosArray = new int[] { 1, 2, 3 };
	    
	    int soma =  IntStream.of(numerosArray).sum();

	    System.out.println(soma);

	}
}