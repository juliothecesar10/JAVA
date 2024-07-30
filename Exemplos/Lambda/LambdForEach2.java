package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;

public class LambdForEach2 {

    public static void main(String[] args) {

        List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );

        itens.forEach(item->System.out.println(item));
    }

}
