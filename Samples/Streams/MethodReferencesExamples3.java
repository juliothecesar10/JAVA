package acc.lambda.sample;

import java.util.*;
import java.util.function.*;

//Objeto precisa ser classificado
class Pessoa2 {
	private String name;
	private Integer age;

	// Constructor
	public Pessoa2()
	{
		Random ran = new Random();

		// Atribuindo um valor aleatório ao nome
		this.name
			= ran
				.ints(97, 122 + 1)
				.limit(7)
				.collect(StringBuilder::new,
						StringBuilder::appendCodePoint,
						StringBuilder::append)
				.toString();
	}

	public Integer getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}

public class MethodReferencesExamples3 {

	// Obter lista de objetos de determinado comprimento e fornecedor
	public static <T> List<T> getObjectList(int length,Supplier<T> objectSupply)	{
		List<T> list = new ArrayList<>();

		for (int i = 0; i < length; i++)
			list.add(objectSupply.get());
		return list;
	}

	public static void main(String[] args)
	{

		// Obtenha 5 pessoas cada pessoa é criada por referência do construtor de pessoa
		List<Pessoa2> personList = getObjectList(5, Pessoa2::new);

		// Imprimir nomes de personList
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}
