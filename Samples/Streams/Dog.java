package acc.lambda.sample;

public class Dog {
	String name;
	int height;
	int weight;
 
	public Dog(String n, int s, int w) {
		this.name = n;
		this.height = s;
		this.weight = w;
	}
    
	@Override
	public String toString() {
		return getName() + ": size=" + getHeight() + " weight=" + getWeight() + " \n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
 
	 
}