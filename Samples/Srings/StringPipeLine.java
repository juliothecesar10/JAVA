package acc.br.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringPipeLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "João";
		String person = "vizinho";
		String location = "vizinhança";

		// The + Operator
		String plusConcat = greeting + " " + person + "! Bem vindo a " + location + "!";

		// StringBuilder
		StringBuilder stringBuilderConcat = new StringBuilder().append(greeting).append(" ").append(person).append("! Bem vindo a ").append(location).append("!");

		// String.concat()
		String stringConcatConcat = greeting.concat(" ").concat(person).concat("! Bem vindo a ").concat(location).concat("!");

		// String.format()
		String stringFormatConcat = String.format("%s %s! Bem vindo a %s!", greeting, person, location);

		// String.join()
		String stringJoinConcat = String.join("" /* delimiter */, greeting, " ", person, "! Bem vindo a ", location,"!");

		// Streams
		String streamsConcat = Arrays.asList(greeting, " ", person, "! Bem vindo a ", location, "!").stream().collect(Collectors.joining());

		System.out.println(stringBuilderConcat);
	}

}
