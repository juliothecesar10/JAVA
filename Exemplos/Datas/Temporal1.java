package br.acc.datas;
import java.time.temporal.ChronoUnit;

public class Temporal1 {

	// Java program to demonstrate 
	// ChronoUnit.values() method 
	public static void main(String[] args) { 

			// get ChronoUnit 
			ChronoUnit chronounit = ChronoUnit.valueOf("FOREVER"); 

			// apply values() 
			ChronoUnit[] array = chronounit.values(); 

			// print 
			for (int i = 0; i < array.length; i++) 
				System.out.println(array[i]); 

	} 
}
