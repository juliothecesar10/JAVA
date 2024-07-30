package acc.lambda.sample;
//Código Java para Stream findAny ()
//que retorna um opcional que descreve
//algum elemento do fluxo, ou um
//Opcional vazio se o fluxo estiver vazio. 
import java.util.OptionalInt; 
import java.util.stream.IntStream; 

public class FindAnyParallel {

		// Driver code 
		public static void main(String[] args) { 
			
		// Creating an IntStream 
		IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16).parallel(); 
		
		// Usando Stream findAny ().
		// Executando o código-fonte várias vezes
		// pode não retornar o mesmo resultado.
		// Cada vez que você pode obter um diferente
		// Inteiro divisível por 4.
		stream = stream.filter(i -> i % 4 == 0); 

		OptionalInt answer = stream.findAny(); 
		if (answer.isPresent()) 
		{ 
			System.out.println(answer.getAsInt()); 
		} 
	} 
} 

