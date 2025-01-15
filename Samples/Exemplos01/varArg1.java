package sef.module3.sample;

public class varArg1 {
	
	public static int sum(int... numbers) {
	    int total = 0;
	    for (int number : numbers) {
	        total += number;
	    }
	    return total;
	}
	
	public static void main(String[] args) {
		int result1 = sum(1, 2, 3); // result1 will be 6
		int result2 = sum(10, 20);   // result2 will be 30
		int result3 = sum();        // result3 will be 0
		int result4 = sum(1, 2, 3,10,20,30, 11,22, 54, 32,24, 18, 26, 34, 41, 90, 18, 37, 49, 7); // result1 will be 6
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
