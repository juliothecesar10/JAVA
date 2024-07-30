package acc.lambda.sample;

import java.util.*;

public class MethodReferencesExamples1 {

	public static void main(String[] args)
	{
		// Criando um ArrayList vazio do tipo definido pelo usuário
		// Lista de pessoa
		List<String> personList = new ArrayList<>();

		// Adicionando elementos a lista de objetos
		personList.add("vickY");
		personList.add("pOonam");
		personList.add("sachin");

		// Referência de método para o tipo String
		Collections.sort(personList,String::compareToIgnoreCase);

		// Imprimindo os elementos (nomes) no console
		personList.forEach(System.out::println);
		
	}
}
