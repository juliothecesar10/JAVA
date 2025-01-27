package acc.lambda.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class 1
// Helper class
// cont�m os m�todos de classifica��o
class Pessoa {

	// Atributos da pessoa
	private String name;
	private Integer age;

	// Constructor
	public Pessoa(String name, Integer age) {
		// o This refere-se ao objeto corrente
		this.name = name;
		this.age = age;
	}

	// Getter-setter methods
	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

// Class 2
// Helper class
// classe de compara��o
class ComparisonProvider {

	// Method 1
	// compara nomes
	public int compareByName(Pessoa a, Pessoa b) {
		return a.getName().compareTo(b.getName());
	}

	// Method 2
	// compara idades
	public int compareByAge(Pessoa a, Pessoa b) {
		return a.getAge().compareTo(b.getAge());
	}
}

// Class 3
// Main class
public class MethodReferencesExamples2 {

	public static void main(String[] args) {
		// Criando um ArrayList vazio do tipo definido pelo usu�rio
		// Lista de pessoa
		List<Pessoa> personList = new ArrayList<>();

		// Adicionando elementos a lista de objetos
		personList.add(new Pessoa("vicky", 24));
		personList.add(new Pessoa("poonam", 25));
		personList.add(new Pessoa("sachin", 19));

		// Uma classe comparadora com v�rios m�todos comparadores
		ComparisonProvider comparator = new ComparisonProvider();

		// Agora usando a refer�ncia do m�todo de inst�ncia para classificar a matriz por nome
		Collections.sort(personList, comparator::compareByName);

		System.out.println("Sort by name :");

		// Usando streams
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		// Usando refer�ncia de m�todo de inst�ncia para classificar array por idade
		Collections.sort(personList, comparator::compareByAge);

		System.out.println("Sort by age :");

		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}
