package sef.module8.sample;

public class CheckUnCheck5 {
	
	static void show() {
		try {
			throw new NullPointerException("check");
		} catch (NullPointerException ex) {
			System.out.println("show() levantou uma exceção");
			throw ex; // rethrowing the exception
		}
	}

	public static void main(String args[]) {
		try {
			show();
		} catch (NullPointerException ex) {
			System.out.println("Exceção no método main");
		}
	}
}