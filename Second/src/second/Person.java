package second;

public class Person {
	
	private String name;
	private float weight;
	private float height;
	
	public Person(String name){
	/*
		this.name = name;
		this.weight = 3.4f;
		this.height = 57.0f;
	*/
		this(name,  3.4f,  57.0f);
	}
	
	public Person(String name, float weight, float height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public Person getThis(){
		return this;
	}
}
