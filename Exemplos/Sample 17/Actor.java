package sef.module17.sample;

public class Actor {
	String first_Name;
	String last_name;
	
	public Actor(String first_Name, String last_name) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
	}
	
	public Actor() {

	}
	
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
