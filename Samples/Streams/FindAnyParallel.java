package acc.lambda.sample;
//C�digo Java para Stream findAny ()
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
		// Executando o c�digo-fonte v�rias vezes
		// pode n�o retornar o mesmo resultado.
		// Cada vez que voc� pode obter um diferente
		// Inteiro divis�vel por 4.
		stream = stream.filter(i -> i % 4 == 0); 

		OptionalInt answer = stream.findAny(); 
		if (answer.isPresent()) 
		{ 
			System.out.println(answer.getAsInt()); 
		} 
	} 
} 

