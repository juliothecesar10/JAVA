/**
 * 
 */
package sef.module3.activity;

import java.util.*;

/**
 * @author
 *
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;

		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}

		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);

		total = 0;

		// complete the code. write for loop for i
		for (int i = 50; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 50 to 100 = " + total);

		// Activity For-each Loop
		List<Integer> lista = new ArrayList<>();
		List<String> listaString = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			lista.add(new Integer(i));
			listaString.add(Integer.toString(i));
		}

		int x = 0;
		while (true) {
			x = x + 1;
			System.out.println(x);
			if (x > 9) {
				break;
			}
		}

		for (Integer n : lista) {
			System.out.print(n.intValue() + " "); // can use print or println
		}
		System.out.println("");

		for (String n : listaString) {
			System.out.print(n + " "); // can use print or println
		}

		// Activity Iterator<E> Loop
		Iterator<Integer> it = lista.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i % 2 == 0) {
				it.remove();
			}
		}

//		lista.removeAll(lista);

		System.out.println("");
		for (Integer n : lista) {
			System.out.print(n.intValue() + " "); // can use print or println
		}

	}

}
