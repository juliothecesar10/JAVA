package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCollectStream {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("Joe", "Kholi", "Sharma");
 
	System.out.println("Usando Estilo Imperativo");
	// Estilo Imperativo
	System.out.println("Estilo Imperativo");
	for (String name : names) {
	    if (!name.equals("Joe")) {
	      Student student = new Student(name);
	      System.out.println(student);
	   }
	 }

	// Estilo Funcional
	System.out.println("Estilo Funcional");
	// Basicamente estamos convertendo o stream em um tipo de Student usando map
	System.out.println("Usando Functional Interface --Refactoring nivel 1");

	names.stream()
		 .filter(MapCollectStream::isNotJoe)
		 .map(new Function<String, Student>() {	
			 @Override
			 public Student apply(String name) {
				 	Student student = new Student(name);
				 	return student;
				 }
		 	})
		 .forEach(System.out::println);

	System.out.println("Usando Lambda Expression --Refactoring nivel 2");

	   names.stream()
	   		.filter(MapCollectStream::isNotJoe)
	        .map(name -> {
	        		Student student = new Student(name);
	        		return student;
	        	})
	        .forEach(System.out::println);

	System.out.println("Usando Method reference--Refactoring nivel 3");

	// Qualquer argumento que vier será passado para a nova Instância do usuário
	names.stream()
	     .filter(MapCollectStream::isNotJoe)
	     .map(Student::new)
	     .forEach(System.out::println);

	//Usando a operação terminal Collect
	List filteredStudent =
	   names.stream()
	        .filter(MapCollectStream::isNotJoe)
	        .map(Student::new)
	        .collect(Collectors.toList());
	 }

	private static boolean isNotJoe(String name) {
	     return !name.equals("Joe");
	}

}