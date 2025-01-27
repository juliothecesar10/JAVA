package acc.lambda.sample;

import java.util.Comparator;
import java.util.stream.Stream;

public class CreatingStreams3 {

    public static void main(String[] args) {
 
        Stream<String> colours = Stream.of("red", "green", "blue"); 
        //Uma stream de 3 strings foi criada.
        String col = colours.skip(2).findFirst().get();  
        //Com o m�todo skip(), pulamos 2 elementos e e encontramos o elemento que sobrou com o m�todo findFirst().   
        System.out.println(col);
        
        Stream<Integer> nums = Stream.of(3, 4, 7, 6, 5);
        int maxVal = nums.max(Comparator.naturalOrder()).get();
        // Criamos uma stream de inteiros e obtemos o maior n�mero.
        System.out.println(maxVal);
    }
}
