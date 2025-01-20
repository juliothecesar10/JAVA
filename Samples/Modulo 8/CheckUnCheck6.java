package sef.module8.sample;

// refatoração do CheckUnCheck5
public class CheckUnCheck6 {

	static void show() throws IllegalAccessException {
		System.out.println("show() levantou uma exceção");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			show();
		} catch (IllegalAccessException ex) {
			System.out.println("Exceção no método main");
		}
	}
}