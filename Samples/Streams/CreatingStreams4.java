package acc.lambda.sample;

import java.util.Random;
import java.util.stream.Stream;
// In the example, we create two streams with Stream.iterate() and Stream.generate().

public class CreatingStreams4 {
 
    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.iterate(5, n -> n * 2).limit(10);
        s1.forEach(System.out::println);
        // O Stream.iterate () retorna um fluxo ordenado sequencial infinito produzido pela aplica��o iterativa de uma fun��o a um elemento inicial.
        // O elemento inicial � chamado de semente.
        // O segundo elemento � gerado aplicando a fun��o ao primeiro elemento.
        // O terceiro elemento � gerado aplicando a fun��o no segundo elemento etc.
        Stream.generate(new Random()::nextDouble)
                .map(e -> (e * 10))
                .limit(5)
                .forEach(System.out::println); 
        // Um fluxo de cinco duplas aleat�rias � criado com o m�todo Stream.generate ()
        // Cada um dos elementos � multiplicado por dez.
        // No final, iteramos no stream e imprimimos cada elemento no console
    } 
}
