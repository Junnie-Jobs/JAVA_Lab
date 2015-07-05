package first;

public class Man {

	//property
	private String name;
	private int height;
	private float weight;
	public String character;
	
	//method()
	//name에 관한 method()
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//height에 관한 method()
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	//weight에 관한 method() {
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getWeight() {
		return weight;
	}
}
