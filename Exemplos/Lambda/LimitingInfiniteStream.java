package acc.lambda.sample;

import java.util.stream.Stream;

public class LimitingInfiniteStream {
    public static void main (String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        stream.filter(i -> i % 2 == 0)
              .limit(5)
              .forEach(System.out::println);
    }
}