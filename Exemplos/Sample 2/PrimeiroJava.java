package sef.module2.sample;

public class PrimeiroJava {

	public static void main(String[] args) {
		int n1 = 5;
		int n2;

		n2 = n1++;
				
		System.out.println("n1 = " +n1);
		System.out.println("n2 = " +n2);
		
		n1 = 5;
		n2 = ++n1;
		
		System.out.println("n1 = " +n1);
		System.out.println("n2 = " +n2);
		
	}

}
