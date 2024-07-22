/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class FindInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create an integer array
		int[] nums = {40, 12, 9, 15, 16, 3, 45, 20, 32, 8, 39, 22};
		
		int menor = nums[0];
		
		// Find smallest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < menor) {
				menor = nums[i];
			}
		}
		System.out.println("Smallest in array is "+menor);
		
		int maior = nums[0];
		
		// Find largest in an array
		for (int i = 1; i < nums.length; i++) {
			// complete the code
			if (nums[i] > maior) {
				maior = nums[i];
			}
		}
		System.out.println("Largest in array is "+maior);
	}
}
