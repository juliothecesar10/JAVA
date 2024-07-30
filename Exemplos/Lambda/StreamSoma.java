package acc.lambda.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSoma {
	public static void main(String[] args) {
		List<Integer[]> minhalista = new ArrayList<>();
		Integer[] a1 = {6,3,8,12};
		minhalista.add(a1);
		Integer[] a2 = {8,13,9,22};
		minhalista.add(a2);
       
  	    System.out.println("--Using IntStream.sum()--");		
	    int soma = minhalista
	    		.stream()
	    		.flatMap(a->Arrays.stream(a))
	    		.mapToInt(Integer::intValue)
	    		.sum();
		System.out.println(soma);	
	}
} 