package acc.lambda.sample;

import java.util.stream.Stream;

public class LimitingInfiniteStream2 {
    public static void main (String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        stream.limit(5)
              .filter(i -> i % 2 == 0)
              .forEach(System.out::println);
    }
}