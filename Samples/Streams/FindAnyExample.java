package acc.lambda.sample;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyExample {

    public static void main (String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel();
        stream = stream.filter(i -> i % 2 == 0);

        OptionalInt opt = stream.findAny();
        if (opt.isPresent()) {
            System.out.println(opt.getAsInt());
        }
    }
}