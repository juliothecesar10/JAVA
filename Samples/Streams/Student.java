package acc.lambda.sample;

public class Student {

	private String name;
	private static String college = "ABC";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " name: " + name + " college: " + college;
	}

}