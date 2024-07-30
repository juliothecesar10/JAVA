package acc.lambda.sample;

import java.util.Random;
import java.util.stream.Stream;
// In the example, we create two streams with Stream.iterate() and Stream.generate().

public class CreatingStreams4 {
 
    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.iterate(5, n -> n * 2).limit(10);
        s1.forEach(System.out::println);
        // O Stream.iterate () retorna um fluxo ordenado sequencial infinito produzido pela aplicação iterativa de uma função a um elemento inicial.
        // O elemento inicial é chamado de semente.
        // O segundo elemento é gerado aplicando a função ao primeiro elemento.
        // O terceiro elemento é gerado aplicando a função no segundo elemento etc.
        Stream.generate(new Random()::nextDouble)
                .map(e -> (e * 10))
                .limit(5)
                .forEach(System.out::println); 
        // Um fluxo de cinco duplas aleatórias é criado com o método Stream.generate ()
        // Cada um dos elementos é multiplicado por dez.
        // No final, iteramos no stream e imprimimos cada elemento no console
    } 
}
