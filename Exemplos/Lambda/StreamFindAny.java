package acc.lambda.sample;

import java.util.*; 

public class StreamFindAny {

	    public static void main(String[] args) 
	    { 
	  
	        // Criando uma lista de inteiros 
	        List<Integer> minhaLista = Arrays.asList(); 
	  
	        // Usando Stream findAny() para retornar 
	        // um Optional que identifica algum elemento 
	        // da stream 
	        Optional<Integer> answer = minhaLista.stream().findAny(); 
	  
	        // se a stream estiver vazia, um  
	        // Optional vazio será retornado. 
	        if (answer.isPresent()) { 
	            System.out.println(answer.get()); 
	        } 
	        else { 
	            System.out.println("nenhum valor"); 
	        } 
	    } 
}
