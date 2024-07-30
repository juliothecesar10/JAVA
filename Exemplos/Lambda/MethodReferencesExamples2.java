package acc.lambda.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class 1
// Helper class
// contém os métodos de classificação
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
// classe de comparação
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
		// Criando um ArrayList vazio do tipo definido pelo usuário
		// Lista de pessoa
		List<Pessoa> personList = new ArrayList<>();

		// Adicionando elementos a lista de objetos
		personList.add(new Pessoa("vicky", 24));
		personList.add(new Pessoa("poonam", 25));
		personList.add(new Pessoa("sachin", 19));

		// Uma classe comparadora com vários métodos comparadores
		ComparisonProvider comparator = new ComparisonProvider();

		// Agora usando a referência do método de instância para classificar a matriz por nome
		Collections.sort(personList, comparator::compareByName);

		System.out.println("Sort by name :");

		// Usando streams
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		// Usando referência de método de instância para classificar array por idade
		Collections.sort(personList, comparator::compareByAge);

		System.out.println("Sort by age :");

		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}
