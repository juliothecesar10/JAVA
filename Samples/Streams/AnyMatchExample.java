package acc.lambda.sample;

import java.util.stream.Stream;

public class AnyMatchExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        
        boolean match = stream.anyMatch(s -> s.contains("our"));
        
        System.out.println(match);
    }
}