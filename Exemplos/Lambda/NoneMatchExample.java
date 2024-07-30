package acc.lambda.sample;

import java.util.stream.Stream;

public class NoneMatchExample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four");
		boolean match = stream.noneMatch(s -> s.length() > 0 && Character.isUpperCase(s.charAt(0)));
		System.out.println(match);
	}
}