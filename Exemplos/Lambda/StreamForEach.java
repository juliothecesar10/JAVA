package acc.lambda.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamForEach {

	public static void main(String args[]) {
		List<String> alphabets = new ArrayList<>(Arrays.asList("aa", "bbb", "cac", "dog"));
		// loop sobre todos os elementos usando o método Iterable.forEach()
		alphabets.forEach(s -> System.out.println(s));
		// Você pode até substituir a expressão lambda pela referência do método
		// porque estamos passando o parâmetro lambda como está para o method
		alphabets.forEach(System.out::println);
		// você pode até fazer algo com o parâmetro lambda, por exemplo. adicionando uma vírgula
		alphabets.forEach(s -> System.out.print(s + ","));
		
		// Existe mais um método forEach() na classe Stream, que opera
		// on stream e permite que você use vários métodos de stream, por exemplo filter() map() etc
		alphabets.stream().forEach(System.out::println);
		// vamos agora imprimir apenas os elementos que começam com "a"
		alphabets.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
		// vamos filtrar apenas o que tem comprimento maior que 2
		alphabets.stream().filter(s -> s.length() > 2).forEach(System.out::println);
		// agora, vamos imprimir o comprimento de cada string usando map()
		alphabets.stream().mapToInt(s -> s.length()).forEach(System.out::println);
		// que tal calcular a soma do comprimento de todas as strings
		alphabets.stream().mapToInt(s -> s.length()).sum();
		// Atividade imprima a soma.
	}
}
