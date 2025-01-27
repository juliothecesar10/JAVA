package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
 
    public static void main(String[] args) {

        List<String> words = Arrays.asList("pen", "coin", "desk", "chair");  // Lista de Strings

        String word = words.stream().findFirst().get();
        // Com o método stream, criamos um stream de uma coleção de lista.
        // No fluxo, chamamos o método findFirst () que retorna o primeiro elemento
        // do fluxo.
        // (Retorna um opcional a partir do qual buscamos o valor com o método get ().)
        System.out.println(word);
        
        Stream<String> letters = Arrays.stream(new String[]{ "a", "b", "c"});  // Array de Strings      
        System.out.printf("There are %d letters%n", letters.count());
        // Criamos um stream a partir de um array.
        // O método count () do fluxo retorna o número de elementos no fluxo.
        
        String day = "Sunday";
        IntStream istr = day.codePoints();
        
        String s = istr.filter(e -> e != 'n').collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(s);
        // Aqui criamos um Stream de uma string.
        // Filtramos os caracteres e construímos uma nova string a partir dos caracteres filtrados.

    }
} 
 