package acc.lambda.sample;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
 
public class DogArraySort {
 
	public static void main(String[] args) {
		Dog d1 = new Dog("Max", 2, 50);
		Dog d2 = new Dog("Rocky", 1, 30);
		Dog d3 = new Dog("Bear", 3, 40);

		Dog[] dogArray = { d1, d2, d3 };
		printDogs(dogArray);
 

//		Expressão Lambda 
		Arrays.sort(dogArray, (Dog m, Dog n) -> m.getWeight() - n.getWeight());
		printDogs(dogArray);

	}
  
	public static void printDogs(Dog[] dogs) {
		System.out.println("--Dog List--");
		for (Dog d : dogs) 
			System.out.print(d);
		System.out.println();
	}
}