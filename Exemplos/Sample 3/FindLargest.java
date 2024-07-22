/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Find Largest of two numbers
				
		int num1 = 10, num2 = 2, num3 = 9;
		
		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers
				
	    num1 = 90; num2 = 55; num3 = 32;
	    	
		if (num1 > num2) {
			if (num1 > num3) // complete code
			{
				System.out.println(num1 + " is Largest of three numbers");
			} else {
				System.out.println(num3 + " is Largest of three numbers");
			}
		} else {
			if (num2 > num3) // complete code
			{
				System.out.println(num2 + " is Largest of three numbers");
			} else {
				System.out.println(num3 + " is Largest of three numbers");
			}
		}
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior");
		} else {
			if (num2 > num1 && num2 > num3) {
				System.out.println(num2 + " é o maior");
			} 
			if (num3 > num1 && num3 > num2) {
				System.out.println(num3 + " é o maior");
			}
		}
	}
}