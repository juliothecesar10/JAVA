package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DepoisdoStream {

    public static void main(String[] args) {
 
        List<String> lista = Arrays.asList("spring", "node", "acc");

        List<String> result = lista.stream()                // convert list to stream
                .filter(elemento -> !"acc".equals(elemento))     
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }

}