package acc.lambda.sample;

public class ClosureType1Demo {
	@FunctionalInterface  // Opcional
 	public interface NumToTextConverter{
		String convert(int x);
	}
	
	public static void main(String[] args) {
		NumToTextConverter textOfWeekDay = NumToTextConverter() -> {
			System.out.println("");
		}
		
		System.out.println("");
	}

	private static NumToTextConverter NumToTextConverter() {
		// TODO Auto-generated method stub
		return null;
	}

}
