package acc.lambda.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LimitExample {

    public static void main (String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};

        System.out.printf("Source: %s%n", Arrays.toString(ints));
        System.out.println("Finding even numbers.");
        runWithoutLimit(Arrays.stream(ints));
        //Note: creating and passing new stream because it
        // cannot be reused after a terminal operation is called.
        runWithLimit(Arrays.stream(ints));
    }

    private static void runWithoutLimit (IntStream stream) {
        System.out.println("Running without limit()");

        //filter even numbers
        stream.filter(i -> i % 2 == 0)
              .forEach(System.out::println);
    }

    private static void runWithLimit (IntStream stream) {
        System.out.println("Running with limit(2)");

        //filter even numbers
        stream.filter(i -> i % 2 == 0)
              .limit(2)
              .forEach(System.out::println);
    }
}