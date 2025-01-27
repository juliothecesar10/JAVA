package acc.lambda.sample;

public class Closure {

	@FunctionalInterface
	public interface Operation {
		void operate(int n);
	}

	public static void main(String args[]) {
		int x = 20;
		int y = 90;
		// here x and n are two variables
		// implementation of lambda expression
		doSum(x, new Operation() {
									// overrides the operate() method
									@Override
									public void operate(int n) {
										// prints the result
										System.out.println("Sum is: " + (n + y));
									}
								});
//		doSum(x, n -> System.out.println(n + y));
	}

	private static void doSum(int i, Operation op) {
		op.operate(i);
	}
}
