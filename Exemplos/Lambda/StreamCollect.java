package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class StreamCollect {

	public static void main(String[] args) {
        List<String> palavra = Arrays.asList("Oracle", "Java", "Magazine");
        List<Integer> tamanhos = palavra.stream()   
        							    .map(String::length)   
        								.collect(Collectors.toList());
        System.out.println(tamanhos);
        
	}

}
