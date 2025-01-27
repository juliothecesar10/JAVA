package acc.lambda.sample;

import java.util.stream.Stream;

public class AllMatchExample {
    public static void main (String[] args) {
        Stream<String> stream = Stream.of("one", "two", "Three", "four");
        
        boolean match = stream.allMatch(s -> s.length() > 0 &&
                            Character.isLowerCase(s.charAt(0)));
        
        System.out.println(match);
    }
}