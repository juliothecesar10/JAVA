package acc.lambda.sample;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindFirstExample {

    public static void main (String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6);
        
        stream = stream.filter(i -> i % 3 == 0);
        
        OptionalInt opt = stream.findFirst();
        if (opt.isPresent()) {
            System.out.println(opt.getAsInt());
        }
    }
}